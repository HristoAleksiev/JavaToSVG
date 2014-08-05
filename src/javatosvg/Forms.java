package javatosvg;

public class Forms {
    private static final StringBuilder build = new StringBuilder();
    
    public static String line(Point firstPoint, Point secondPoint){
        build.delete(0, build.length());
        build.append("<line class=\"");
        build.append("lineOne");
        build.append("\" x1=\"");
        build.append(firstPoint.coordX_Get());
        build.append("\" y1=\"");
        build.append(firstPoint.coordY_Get());
        build.append("\" x2=\"");
        build.append(secondPoint.coordX_Get());
        build.append("\" y2=\"");
        build.append(secondPoint.coordY_Get());
        build.append("\" /> \n");
        
        return build.toString(); 
    }
    
    public static String polygon(Point pointOne, Point pointtwo,
            Point pointThree){
        
        build.delete(0, build.length());
        build.append("<polygon class=\"");
        build.append("forms");
        build.append("\" points=\"");
        build.append(pointOne.coordX_Get());
        build.append(",");
        build.append(pointOne.coordY_Get());
        build.append(" ");
        build.append(pointtwo.coordX_Get());
        build.append(",");
        build.append(pointtwo.coordY_Get());
        build.append(" ");
        build.append(pointThree.coordX_Get());
        build.append(",");
        build.append(pointThree.coordY_Get());
        build.append(" \" /> \n");
        
        return build.toString();
    }
    
    public static String polygon(Point pointOne, Point pointtwo,
            Point pointThree, Point pointFour){
        
        build.delete(0, build.length());
        build.append("<polygon class=\"");
        build.append("forms");
        build.append("\" points=\"");
        build.append(pointOne.coordX_Get());
        build.append(",");
        build.append(pointOne.coordY_Get());
        build.append(" ");
        build.append(pointtwo.coordX_Get());
        build.append(",");
        build.append(pointtwo.coordY_Get());
        build.append(" ");
        build.append(pointThree.coordX_Get());
        build.append(",");
        build.append(pointThree.coordY_Get());
        build.append(" ");
        build.append(pointFour.coordX_Get());
        build.append(",");
        build.append(pointFour.coordY_Get());
        build.append(" \" /> \n");
        
        return build.toString();
    }
    
    public static String blackCircle(Point point){
        build.delete(0, build.length());
        
        build.append("<circle class=\"blackCircle circle\" cx=\"");
        build.append(point.coordX_Get());
        build.append("\" cy=\"");
        build.append(point.coordY_Get());
        build.append("\" r=\"3\" /> \n");
        
        return build.toString();
    }
    
    public static String greyCircle(Point point){
        build.delete(0, build.length());
        
        build.append("<circle class=\"greyCircle circle\" cx=\"");
        build.append(point.coordX_Get());
        build.append("\" cy=\"");
        build.append(point.coordY_Get());
        build.append("\" r=\"3\" /> \n");
        
        return build.toString();
    }
}
