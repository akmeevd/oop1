public class Main {
    public static void main(String[] args) {
        Human human = new Human("Максим", "Минск", 35, "бренд-менеджер");
        Human human1 = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human human2 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human human3 = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        human.printHuman();
        human1.printHuman();
        human2.printHuman();
        human3.printHuman();

    }
}