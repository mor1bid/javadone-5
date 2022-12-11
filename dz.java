/**
 * dz
 */
import java.util.*;
public class dz {

    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("SorokinIS", "+79788000008, сисадмин");
        phonebook.put("TeterevNA", "+79788000007, электрик");
        phonebook.put("RizhovaAA2", "+79788000006(домашний), куратор");
        phonebook.put("RizhovaAA", "+79788000016(рабочий), куратор");
        System.out.println("1. Здравствуйте. Введите желаемые фамилию, инициалы без точек и если необходимо цифру от 2 до кол-ва рабочих номеров нужной персоны:");
        String key = work.nextLine();
        System.out.println(phonebook.get(key) + "\n2.");

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
        prols.add("Пётр Петин");
        prols.add("Иван Ежов");
        int co = 0;
        String temp = "";
        String temp2 = "";
        for (String s : prols) 
        {
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
        for (int o = 0; o < names.size(); o++) 
        {
            for (String p : names) { if (names.get(o).equals(p)) { co++; } }
            if (names.get(o).equals(temp)) {}
            else {
                System.out.println(names.get(o) + " - " + co + " раз(а)"); 
                if (co>1) { temp = names.get(o); }
            }
            if (names.get(o).equals(temp2)) {}
            else if (co>1) { names.remove(o); temp2 = names.get(o); }
            recs.add(co);
            co = 0;
        }
        // System.out.println(Arrays.asList(recs));
        // System.out.println(Arrays.asList(names));
        // Сортировка
            for (int i = 0; i<recs.size(); i++) 
            {
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
        System.out.println(Arrays.asList(recs));
        System.out.println(Arrays.asList(names));

    System.out.println("\n3. ");
    LinkedList<Integer> ray = new LinkedList<>();
    ray.add(4);
    ray.add(10);
    ray.add(3);
    ray.add(5);
    ray.add(1);
    int si = ray.size();
    heap2(ray, si);
    System.out.println(ray);
    work.close();
}
    public static void heap1(LinkedList<Integer> heapso, int si, int i) 
    {
        int pa = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < si && heapso.get(pa) < heapso.get(left)) { pa = left; }
        if (right < si && heapso.get(pa) < heapso.get(right)) { pa = right; }
        if (pa != i) 
        {
            int temp = heapso.get(i);
            heapso.set(i, heapso.get(pa));
            heapso.set(pa, temp);
            heap1(heapso, si, pa);
        }
    }
    public static void heap2(LinkedList<Integer> heapso, int si) 
    {
        if (si == 0) { return; }
        for (int i = si / 2 - 1; i >= 0; i--) { heap1(heapso, si, i); }
        for (int i = si - 1; i >= 0; i--) 
        {
            int temp = heapso.get(0);
            heapso.set(0, heapso.get(i));
            heapso.set(i, temp);
            heap1(heapso, i, 0);
        }
    }
}