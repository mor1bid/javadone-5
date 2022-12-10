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

        ArrayList<String> prols = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        LinkedList<Integer> recs = new LinkedList<>();
        prols.add("Иван Иванцов");
        prols.add("Светлана Петровна");
        prols.add("Кристина Белова");
        prols.add("Анна Мусина");
        prols.add("Анна Крутова");
        prols.add("Иван Юрин");
        prols.add("Пётр Лыков");
        prols.add("Павел Чернов");
        prols.add("Пётр Чернышов");
        prols.add("Мария Фёдоровна");
        prols.add("Марина Светлова");
        prols.add("Мария Савина");
        prols.add("Мария Рыкова");
        prols.add("Марина Лугова");
        prols.add("Анна Владимировна");
        prols.add("Иван Мечников");
        int co = 0;
        String temp = "";
        String temp2 = "";
        for (String s : prols) {
            String name = "";
            for (int i = 0; i < s.length(); i++) {
                String lett = Character.toString(s.charAt(i));
                if (lett.equals(" ")) {
                    names.add(name);
                    i = s.length();
                }
                else { name += lett; }
            }
            
        }
        System.out.println(Arrays.asList(names));
        for (String o : names) 
        {
            for (String p : names) { if (o.equals(p)) co++; }
            // if (o!=temp) 
            // {
            //     System.out.println(o + " - " + co + " раз"); 
            //     if (co>1) { temp = o; }
            // }

            recs.add(co);
        // Сортировка
            for (int i = 0; i<recs.size(); i++) {
                int numi = recs.get(i);
                String nami = names.get(i);
                for (int j = 0; j<recs.size(); j++) 
                {
                    int numj = recs.get(j);
                    String namj = names.get(j);
                    if (numi>numj) 
                    {
                        recs.set(j, numi);
                        names.set(j, nami);
                        recs.set(i, numj);
                        names.set(i, namj);
                        j = recs.size(); 
                    }
                }
            }
            co = 0;
        }
        System.out.println(Arrays.asList(names));
        for (int r = 0; r < names.size(); r++) {
            int call = 0;
            String rword = names.get(r);
            for (int d = 0; d < names.size(); d++) {
                String dword = names.get(d);
                if (rword.equals(dword)) { 
                    call++; 
                    if (call > 1) { names.remove(d); }
                }
            }
        }
        System.out.println(Arrays.asList(recs));
        System.out.println(Arrays.asList(names));
        work.close();
    }
}