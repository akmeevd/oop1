import java.time.LocalDate;

public class Human {
    String name;
    String town;
    int age;
    int yearOfBirth;
    String job;

    Human() {

    }

    public Human(String name, String town, int age, String job) {
        int currentYear = LocalDate.now().getYear();
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (job == null) {
            this.job = "Информация не указана";
        }else {
            this.job = job;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        this.yearOfBirth = currentYear - age;
        if (yearOfBirth < 0) {
            yearOfBirth = 0;
        }

    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }

}

