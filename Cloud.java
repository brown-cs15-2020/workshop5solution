package workshop5solution;

import javafx.scene.shape.Circle;
import java.util.Arrays;
import java.util.List;

public class Cloud {
    private int _type;
    private Bubble[] _cloudBubbles;

    public Cloud(int type){
        _cloudBubbles =new Bubble[4];
        _type=type;
        this.generateCloud();
        this.arrangeCloud();
    }
    public void generateCloud(){
        for( int i =0; i<4; i++){
            _cloudBubbles[i]=new Bubble();
        }
    }

    public void arrangeCloud(){
        int [][] coordinates;
        if(_type==1){
            coordinates = Constants.CLOUD_1;
        }else{
            coordinates = Constants.CLOUD_2;
        }
        for(int i =0; i<_cloudBubbles.length; i++){
            _cloudBubbles[i].setSize(10);
            _cloudBubbles[i].setX(coordinates[i][0]);
            _cloudBubbles[i].setY(coordinates[i][1]);
            _cloudBubbles[i].setSize(Constants.BUBBLE_SIZE);
        }
    }

    public List<Circle> getComponents(){
        return Arrays.asList(_cloudBubbles[0].getBubble(),_cloudBubbles[1].getBubble(),
        _cloudBubbles[2].getBubble(),_cloudBubbles[3].getBubble());
    }
}
