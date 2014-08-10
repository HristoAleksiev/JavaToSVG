package javatosvg;

public class Renderer {
    FileInputOutput file = new FileInputOutput();
    
    public Renderer(){
    }
    
    public void buildSVG(){
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
