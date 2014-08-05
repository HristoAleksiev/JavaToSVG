package javatosvg;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileInputOutput {
  
    private String path;
    private List<String> fileContent;
    
    public Path get_path(){
        return Paths.get(path);
    }
    private void set_path(String value){
        path = value;
    }
    public List<String> get_content(){
        return fileContent;
    }
    private void set_content(List<String> value){
        fileContent = value;
    }
    
    public  FileInputOutput(String path){
        set_path(path);
        set_content(readFile());
    }
    
    private List<String> readFile(){
        String line;
        List<String> content = new ArrayList<>();
        
        try(BufferedReader reader = Files.newBufferedReader(get_path())){
            for (int i = 0; (line = reader.readLine()) != null; i++) {
                content.add(line + "\n");
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
            return content;
    }
    
    private String readContentToString(List<String> contentArray){
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < contentArray.size(); i++) {
            builder.append(contentArray.get(i));
        }
        return builder.toString();
    } 
    
    public void writeToFile(List<String> content){
        try (BufferedWriter writer = Files.newBufferedWriter(get_path())){
            writer.write(readContentToString(content));
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
    
    public void writeStuff(String content){
        int lineNum = 6;
        
        do {
            if (fileContent.get(lineNum).equals("\t\n")) {
                fileContent.add(lineNum, content);
                writeToFile(fileContent);
                return;
            }
            lineNum++;
        } while (lineNum < fileContent.size());
    }
    
    public void initiallizeWithHtmlTemplate(){
        if (fileContent.isEmpty()) {
            String htmlTemplatePath = 
                    "C:\\GitRepos\\JavaToSVG\\Templates\\html_template.html";
            String line;
            Path templatePath = Paths.get(htmlTemplatePath);

            try(BufferedReader reader = Files.newBufferedReader(templatePath)){
                for (int i = 0; (line = reader.readLine()) != null; i++) {
                    fileContent.add(line + "\n");
                }
            } catch (IOException x) {
                System.err.format("IOException: %s%n", x);
            }
            writeToFile(fileContent);
        }
    }
}
