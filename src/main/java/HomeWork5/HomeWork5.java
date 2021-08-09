package HomeWork5;

public class HomeWork5 {

   public static Workers[] workerArray = new Workers[5];

    public static void main(String[] args) {
        workersFill();
        printIfOver40Age();
    }

    public static void workersFill() {
        workerArray[0] = new Workers(
                "Xam",
                22,
                "Какаято должность",
                "mg.mg.ghostrecon7@mail.ru",
                89639346725l,
                1000000);

        workerArray[2] = new Workers(
                "Еще ктото",
                34,
                "Какая то должность",
                "12314@.mail.ru",
                35345412363567l,
                400000);

        workerArray[3] = new Workers(
                "Хз",
                38,
                "Какая то должность",
                "12314@.mail.ru",
                1245723412363567l,
                400000);

        workerArray[4] = new Workers(
                "дед",
                84,
                "Какая то должность",
                "12314@.mail.ru",
                35412312363567l,
                400000);

        workerArray[1] = new Workers(
                "Мужик",
                54,
                "Какая то должность",
                "12314@.mail.ru",
                3545723411231l,
                400000);
    }

    public static void printIfOver40Age() {
        for (int counter = 0; counter < workerArray.length; counter++) {
            if (workerArray[counter].getAge() > 40) {
                System.out.println(workerArray[counter]);
            }
        }
    }

}
