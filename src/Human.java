import java.time.LocalDate;

public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    private String job;


    public Human(String name, String town, int age, String job) {
        int currentYear = LocalDate.now().getYear();
        this.name = name;
        this.town = town;
        this.yearOfBirth = currentYear - age;
        this.job = job;
    }

    void printHuman() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", city='" + town + '\'' +
                ", birthYear=" + yearOfBirth +
                '}';
    }
}
