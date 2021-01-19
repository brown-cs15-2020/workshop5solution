package workshop5solution;

import javafx.scene.shape.Circle;

public class Cloud {
    private int _type;
    private Bubble[] _cloudBubbles;
    public Cloud(int type){
        _cloudBubbles =new Bubble[4];
        _type=type;
    }
    public void generateCloud(){
        for( int i =0; i<4; i++){
            _cloudBubbles[i]=new Bubble();
        }
    }

    public void arrangeCloud(){
        int [][] coordinates;
        if(_type==0){
            coordinates = Constants.CLOUD_0;
        }else{
            coordinates = Constants.CLOUD_1;
        }
        for(int i =0; i<_cloudBubbles.length; i++){
            _cloudBubbles[i].setSize(10);
            _cloudBubbles[i].setX(coordinates[i][0]);
            _cloudBubbles[i].setY(coordinates[i][1]);
        }
    }

    public Circle[] getComps(){
        Circle[] circleArray =  {_cloudBubbles[0]._getBubble(),_cloudBubbles[1]._getBubble(),
        _cloudBubbles[2]._getBubble(),_cloudBubbles[3]._getBubble()};
        return circleArray;
    }
}
