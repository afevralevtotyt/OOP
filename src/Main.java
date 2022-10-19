public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 1987, "Минск");
        Human ann = new Human("Аня", 1993, "Москва");
        Human kate = new Human("Катя", 1994, "Калининград");
        Human artem = new Human("Артем", 1995, "Москва");
        maxim.job = "бренд-менеджер";
        ann.job = "методист образовательных программ";
        kate.job = "продакт-менеджер";
        artem.job = "директор по развитию бизнеса";
        maxim.printHello();
        ann.printHello();
        kate.printHello();
        artem.printHello();


    }
}
