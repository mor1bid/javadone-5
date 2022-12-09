/**
 * dz
 */
import java.util.*;
public class dz {

    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("СорокинИС", "+79788000008, сисадмин");
        phonebook.put("ТетеревНА", "+79788000007, электрик");
        phonebook.put("РыжоваАА2", "+79788000006(домашний), куратор");
        phonebook.put("РыжоваАА", "+79788000016(рабочий), куратор");
        System.out.println("1. Здравствуйте. Введите желаемые фамилию, инициалы без точек и если необходимо цифру от 2 до кол-ва рабочих номеров нужной персоны:");
        String key = work.nextLine();
        System.out.println(phonebook.get(key));
        work.close();
    }
}