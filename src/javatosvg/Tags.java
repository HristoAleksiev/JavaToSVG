package javatosvg;

public class Tags {
    static StringBuilder build = new StringBuilder();
        public static String open(int vBValueOne, int vBValueTwo,
                int vBValueThree, int vBValueFour){
            build.delete(0, build.length());
            build.append("<svg class=\"");
            build.append("svg");
            build.append("\" viewBox=\"");
            build.append(vBValueOne + " ");
            build.append(vBValueTwo + " ");
            build.append(vBValueThree + " ");
            build.append(vBValueFour);
            build.append("\">\n");
            
            return build.toString();
        }
        public static String close(){
            build.delete(0, build.length());            
            build.append("</svg> \n");
            
            return build.toString();
        }
}
