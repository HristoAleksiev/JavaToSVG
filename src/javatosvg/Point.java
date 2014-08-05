package javatosvg;

public class Point {
    private int coordX;
    private int coordY;
    
    public int coordX_Get(){
        return coordX;
    }
    private void coordX_Set(int value){
        this.coordX = value;
    }
    public int coordY_Get(){
        return coordY;
    }
    private void coordY_Set(int value){
        this.coordY = value;
    }
    
    public Point(int coordX, int coordY){
        coordX_Set(coordX);
        coordY_Set(coordY);
    }
}
