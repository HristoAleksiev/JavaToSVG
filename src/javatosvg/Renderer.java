package javatosvg;

public class Renderer {
    private final String filePath = "C:\\GitRepos\\JavaToSVG\\Output\\svg_ready.html";
    FileInputOutput file = new FileInputOutput(filePath);
    
    public Renderer(){
        file.initiallizeWithHtmlTemplate();
    }
    
    public void draw(String str){
        file.writeStuff(str);
    }
}
