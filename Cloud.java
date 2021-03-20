package workshop5solution;

public class Cloud {
    private int[][] _coords;
    private Bubble[] _cloudBubbles;

    public Cloud(int[][] configuration){
        _cloudBubbles = new Bubble[4];
        _coords = configuration;

        this.generateCloud();
    }

    public void generateCloud(){
        for(int i = 0; i<4; i++){
            _cloudBubbles[i] = new Bubble(Constants.BUBBLE_SIZE);
        }

        this.arrangeCloud();
    }

    public void arrangeCloud(){
        for(int i = 0; i < _cloudBubbles.length; i++){
            _cloudBubbles[i].setX(_coords[i][0]);
            _cloudBubbles[i].setY(_coords[i][1]);
        }
    }

    public Bubble[] getComponents(){
        return _cloudBubbles;
    }
}
