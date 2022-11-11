package TrafficLIghts;

public class TrafficLights {
    private Color color;

    public TrafficLights(Color color) {
        this.color = color;
    }

    public void changeColor(){
        switch (color){
            case RED:
                color=Color.GREEN;
                break;
            case GREEN:
                color=Color.YELLOW;
                break;
            case YELLOW:
                color=Color.RED;
                break;
        }
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

