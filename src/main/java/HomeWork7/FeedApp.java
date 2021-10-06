package HomeWork7;
/**
1. Расширить задачу про котов и тарелки с едой.

2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).

3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 Если коту удалось покушать (хватило еды), сытость = true.

4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 и потом вывести информацию о сытости котов в консоль.

6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
public class FeedApp {
    public static void main(String[] args) {
        Plate[] plate = new Plate[2];
        plate[0] = new Plate(15);
        plate[1] = new Plate(30);
        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Барсик", 60, false);
        cat[1] = new Cat("Вася", 80, false);

        while (!cat[0].isSatiety()){
            for (int i = 0; i < plate.length; i++){
                cat[0].eat(plate[i]);

                if (plate[i].getFood() == 0) {
                    plate[i].fellPlate();
                }
            }
        }
        while (!cat[1].isSatiety()){
            for (int i = 0; i < plate.length; i++){
                cat[1].eat(plate[i]);

                if (plate[i].getFood() == 0) {
                    plate[i].fellPlate();
                }
            }
        }
/*        while (!cat[1].isSatiety() || !cat[0].isSatiety()) {
            for (int i = 0; i < cat.length; i++) {
                for (int j = 0; j < plate.length; j++) {
                    cat[i].eat(plate[j]);
                    if (plate[i].getFood() == 0) {
                        plate[i].fellPlate();
                    }
                }
            }
        }*/


    }

}
