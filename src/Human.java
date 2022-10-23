import java.time.LocalDate;
import java.time.Year;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int age, String town, String job) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear();
        }
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }

    void printHello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        } else {
            this.job = "Информация не указана";
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearOfBirth = LocalDate.now().getYear();
        }
    }
}
