package javatosvg;

public class JavaToSVG {
    public static void main(String[] args){
        Forms drawStuff = new Forms();
        Renderer render = new Renderer();
        
        // Create lines
        
            // Horizontal:
        render.draw(drawStuff.line(new Point(50, 50),
                new Point(250, 50)));
        render.draw(drawStuff.line(new Point(50, 85),
                new Point(250, 85)));
        render.draw(drawStuff.line(new Point(50, 120),
                new Point(250, 120)));
        render.draw(drawStuff.line(new Point(50, 155), 
                new Point(250, 155)));
        render.draw(drawStuff.line(new Point(50, 190),
                new Point(250, 190)));
        render.draw(drawStuff.line(new Point(50, 225),
                new Point(250, 225)));
        
            // Vertical:
        render.draw(drawStuff.line(new Point(60, 30),
                new Point(60, 240)));
        render.draw(drawStuff.line(new Point(95, 30),
                new Point(95, 240)));
        render.draw(drawStuff.line(new Point(130, 30),
                new Point(130, 240)));
        render.draw(drawStuff.line(new Point(165, 30), 
                new Point(165, 240)));
        render.draw(drawStuff.line(new Point(200, 30),
                new Point(200, 240)));
        render.draw(drawStuff.line(new Point(235, 30),
                new Point(235, 240)));
        
        // Create polygons
        
        render.draw(drawStuff.polygon(new Point(165, 50),
                new Point(95, 120),
                new Point(235, 120)));
        render.draw(drawStuff.polygon(new Point(95, 120),
                new Point(95, 190),
                new Point(165, 190),
                new Point(165, 120)));
        render.draw(drawStuff.polygon(new Point(200, 120),
                new Point(200, 190),
                new Point(235, 190), 
                new Point(235, 120)));
        
        // Create Circles
        
        render.draw(drawStuff.blackCircle(new Point(165, 85)));
        render.draw(drawStuff.greyCircle(new Point(10, 20)));
    }
}