package javatosvg;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileInputOutput {
  
    private static String path = null;
    private List<String> fileContent;
    private boolean isFileEmprtyAtStart;
    
    public static Path get_path(){        
        return Paths.get(path);
    }
    public static String get_path_asString(){
        return path;
    }
    public static void set_path(String value){
        path = value;
    }
    public List<String> get_content(){
        return fileContent;
    }
    private void set_content(List<String> value){
        fileContent = value;
    }
    private void set_fileState(){
        isFileEmprtyAtStart = fileContent.isEmpty();
    }
    public boolean get_fileState(){
        return isFileEmprtyAtStart;
    }
    
    public FileInputOutput(){
    }
    
    public  FileInputOutput(String path){
        set_content(readFile());
        set_fileState();
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
    
    // To be used by the program only
    public void writeOnLine(String content, int line){
        fileContent.add(line, content);
        writeToFile(fileContent);
    }
    //
    
    public void writeStuff(String content){
        int lineNum = 7;
        
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
        if (isFileEmprtyAtStart) {
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
