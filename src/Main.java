import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Human human = new Human(null, "Минск", 35, "бренд-менеджер");
        Human human1 = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human human2 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human human3 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");


        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);



    }
}