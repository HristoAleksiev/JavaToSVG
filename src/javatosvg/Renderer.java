package javatosvg;

public class Renderer {
    private final String filePath = "C:\\GitRepos\\JavaToSVG\\Output\\svg_ready.html";
    FileInputOutput file = new FileInputOutput(filePath);
    
    public Renderer(){
        file.initiallizeWithHtmlTemplate();
    
        // Will leave this incomplete for now,
        // html implies that a closing tag is present,
        // even there isn't
        file.writeStuff(Tags.SVG(SVG.Open));
    }
    
    public void draw(String str){
        file.writeStuff(str);
    }
}
