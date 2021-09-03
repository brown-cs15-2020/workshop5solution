package workshop5solution;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bubble {
    private Circle bubble;

    public Bubble(int radius){
        this.bubble = new Circle();
        this.bubble.setFill(Color.WHITE);
        this.bubble.setRadius(radius);
    }

    public void setX(double x){
        this.bubble.setCenterX(x);
    }

    public void setY(double y){
        this.bubble.setCenterY(y);
    }

    public Circle getBubble(){
        return this.bubble;
    }
}
