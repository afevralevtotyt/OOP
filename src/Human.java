import java.time.Year;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;
    public Human(int yearOfBirth) {
        this("Информация не указана", yearOfBirth, "Информация не указана", "Информация не указана");
    }
    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        if (yearOfBirth>0){
        this.yearOfBirth = yearOfBirth;}
        else {
            this.yearOfBirth =0;
        }
        this.town = town;
        this.job=job;
    }

    void printHello(){
        System.out.println("Привет! Меня зовут "+ name +". Я из города "+ town + ". Я родился в "+yearOfBirth+ " году. Я работаю на должности "+ job+ ". Будем знакомы!");

    }
}
