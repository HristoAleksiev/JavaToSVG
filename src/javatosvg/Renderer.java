package javatosvg;

public class Renderer {
    private final String filePath = "C:\\GitRepos\\JavaToSVG\\Output\\svg_ready.html";
    FileInputOutput file = new FileInputOutput(filePath);
    
    public Renderer(){
        file.initiallizeWithHtmlTemplate();
    
        if (file.get_fileState()) {
            file.writeOnLine(Tags.SVG(SVG.Open), 6);
            file.writeOnLine("\t\n", 7);
            file.writeOnLine(Tags.SVG(SVG.Close), 8);
        }
    }
    
    public void draw(String str){
        if (file.get_fileState()) {
            file.writeStuff(str);
        }
    }
}
