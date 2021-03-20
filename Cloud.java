package workshop5solution;

import javafx.scene.shape.Circle;
import java.util.Arrays;
import java.util.List;

public class Cloud {
    private int[][] _coords;
    private Bubble[] _cloudBubbles;

    public Cloud(int[][] configuration){
        _cloudBubbles = new Bubble[4];
        _coords = configuration;
        this.generateCloud();
    }
    public void generateCloud(){
        for( int i =0; i<4; i++){
            _cloudBubbles[i] = new Bubble();
        }
        this.arrangeCloud();
    }

    public void arrangeCloud(){
        for(int i = 0; i < _cloudBubbles.length; i++){
            _cloudBubbles[i].setSize(10);
            _cloudBubbles[i].setX(_coords[i][0]);
            _cloudBubbles[i].setY(_coords[i][1]);
            _cloudBubbles[i].setSize(Constants.BUBBLE_SIZE);
        }
    }

    public List<Circle> getComponents(){
        return Arrays.asList(_cloudBubbles[0].getBubble(),_cloudBubbles[1].getBubble(),
        _cloudBubbles[2].getBubble(),_cloudBubbles[3].getBubble());
    }
}
