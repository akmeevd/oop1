import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        human.name = "Максим";
        human.town = "Минск";
        human.age = 35;
        human.job = "бренд-менеджер";
        human1.name = "Артем";
        human1.town = "Москва";
        human1.age = 27;
        human1.job = "директор по развитию бизнеса";
        human2.name = "Катя";
        human2.town = "Калининград";
        human2.yearOfBirth = 28;
        human2.job = "продакт-менеджер";
        human3.name = "Аня";
        human3.town = "Москва";
        human3.yearOfBirth = 29;
        human3.job = "методист образовательных программ";
        System.out.println(human);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);


//        human.printHuman();
//        human1.printHuman();
//        human2.printHuman();
//        human3.printHuman();

        //"Аня", "Москва", 29, "методист образовательных программ"
        //"Катя", "Калининград", 28, "продакт-менеджер"
        //"Артем", "Москва", 27, "директор по развитию бизнеса"
        //"Максим", "Минск", 35, "бренд-менеджер"


    }
}