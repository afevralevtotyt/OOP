import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static java.util.Collections.min;
public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 35, "Минск", "бренд-менеджер");
        Human ann = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", "");
        maxim.printHello();
        ann.printHello();
        kate.printHello();
        artem.printHello();
        vladimir.printHello();
    }}