public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    public Human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }
    void printHello(){
        System.out.println("Привет! Меня зовут "+ name +". Я из города "+ town + ". Я родился в "+yearOfBirth+ " году. Я работаю на должности "+ job+ ". Будем знакомы!");

    }
}
