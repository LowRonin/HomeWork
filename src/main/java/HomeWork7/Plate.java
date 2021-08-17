package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void feed(int feed){
        if (food >= feed) {
            food -= feed;
        } else food = 0;
    }

    public void fellPlate(){
        if (food == 0){
            food =+ 30;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("""
                Plate =""" + " " + food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "capacity=" + food +
                '}';
    }
}
