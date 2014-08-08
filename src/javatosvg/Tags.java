package javatosvg;

public class Tags {
    static StringBuilder build = new StringBuilder();
    
    public static String SVG(SVG tag){
        if (tag == SVG.Open) {
            build.delete(0, build.length());
            build.append("<svg class=\"");
            build.append("svg");
            build.append("\" viewBox=\"");
            build.append(0);
            build.append(" ");
            build.append(0);
            build.append(" ");
            build.append(700);
            build.append(" ");
            build.append(700);
            build.append("\">\n");
        }
        else if (tag == SVG.Close) {
            build.delete(0, build.length());            
            build.append("</svg>");
        }
        
        return build.toString();
    }
}
