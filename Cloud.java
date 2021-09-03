package workshop5solution;

public class Cloud {
    private int[][] coords;
    private Bubble[] cloudBubbles;

    public Cloud(int[][] configuration){
        this.cloudBubbles = new Bubble[4];
        this.coords = configuration;

        this.generateCloud();
    }

    public void generateCloud(){
        for(int i = 0; i<4; i++){
            this.cloudBubbles[i] = new Bubble(Constants.BUBBLE_SIZE);
        }

        this.arrangeCloud();
    }

    public void arrangeCloud(){
        for(int i = 0; i < this.cloudBubbles.length; i++){
            this.cloudBubbles[i].setX(this.coords[i][0]);
            this.cloudBubbles[i].setY(this.coords[i][1]);
        }
    }

    public Bubble[] getComponents(){
        return this.cloudBubbles;
    }
}
