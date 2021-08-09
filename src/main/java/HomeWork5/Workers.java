package HomeWork5;

/** 1 Задание
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 */
public class Workers {
    private String name;
    private String post;
    private String email;
    private long phone;
    private double salary;
    private int age;

    /** 2 Задание
 * Конструктор класса должен заполнять эти поля при создании объекта.
 */
    public Workers(String name, int age, String post, String email, long phone, double salary){
        this.name = name;
        this.post = post;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}

