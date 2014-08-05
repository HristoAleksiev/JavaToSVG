package javatosvg;

public class Renderer {
    private final String filePath = "C:\\Java\\Training\\SVG Test\\SVg.html";
    FileInputOutput file = new FileInputOutput(filePath);
    
    public Renderer(){
        file.initiallizeWithHtmlTemplate();
    }
    
    public void draw(String str){
        file.writeStuff(str);
    }
}
