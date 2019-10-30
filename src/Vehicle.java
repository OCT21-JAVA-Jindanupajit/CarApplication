public abstract class Vehicle {


    private String make;
    private String model;
    private Color color;
    private Integer speed;
    boolean start;




    public Vehicle(String make, String model, Color color, Integer speed, boolean start) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.start = start;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", color.getLabel().toLowerCase(), make, model);
    }

    public String act(String verb, String obj) {
        return String.format("The %s %s %s",this,verb!=null?verb:"",obj!=null?obj:"");
    }

    public String act(String verb) {
        return act(verb,null);
    }

    public String act() {
        return act(null,null);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
