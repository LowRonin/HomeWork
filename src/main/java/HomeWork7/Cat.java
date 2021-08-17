package HomeWork7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void catSatiety(int plate){
        if (this.appetite > plate){
            appetite -= plate;
            this.satiety = false;
        } else {
            this.appetite = 0;
            this.satiety = true;
        }
    }

    public void eat(Plate plate){
        if (this.satiety == true) {
            System.out.println(name + " не желает трапезничать");
            return;
        }
        int untilSatiety = plate.getFood();
        if (plate.getFood() >= appetite) {
            plate.feed(appetite);
            catSatiety(untilSatiety);
            System.out.println(name + " поел. Остаток в миске - " + plate.getFood());
        } else if (plate.getFood() == 0){
            System.out.println("Миска пуста." + name + " не наелся.");
        } else {
            plate.feed(appetite);
            catSatiety(untilSatiety);
            System.out.println(name + " не наелся");
        }


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
