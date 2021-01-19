package workshop5solution;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bubble {
    private Circle _bubble;

    public Bubble(){
        _bubble = new Circle();
        _bubble.setFill(Color.WHITE);
    }

    public void setSize(double radius){
        _bubble.setRadius(radius);
    }

    public void setX(double x){
        _bubble.setCenterX(x);
    }

    public void setY(double y){
        _bubble.setCenterY(y);
    }

    public Circle _getBubble(){
        return _bubble;
    }
}
