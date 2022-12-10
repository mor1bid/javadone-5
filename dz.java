/**
 * dz
 */
import java.util.*;
public class dz {

    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        // Map<String, String> phonebook = new HashMap<>();
        // phonebook.put("SorokinIS", "+79788000008, сисадмин");
        // phonebook.put("TeterevNA", "+79788000007, электрик");
        // phonebook.put("RizhovaAA2", "+79788000006(домашний), куратор");
        // phonebook.put("RizhovaAA", "+79788000016(рабочий), куратор");
        // System.out.println("1. Здравствуйте. Введите желаемые фамилию, инициалы без точек и если необходимо цифру от 2 до кол-ва рабочих номеров нужной персоны:");
        // String key = work.nextLine();
        // System.out.println(phonebook.get(key) + "\n2.");

        // ArrayList<String> prols = new ArrayList<>();
        // ArrayList<String> names = new ArrayList<>();
        // LinkedList<Integer> recs = new LinkedList<>();
        // prols.add("Иван Иванцов");
        // prols.add("Светлана Петровна");
        // prols.add("Кристина Белова");
        // prols.add("Анна Мусина");
        // prols.add("Анна Крутова");
        // prols.add("Иван Юрин");
        // prols.add("Пётр Лыков");
        // prols.add("Павел Чернов");
        // prols.add("Пётр Чернышов");
        // prols.add("Мария Фёдоровна");
        // prols.add("Марина Светлова");
        // prols.add("Мария Савина");
        // prols.add("Мария Рыкова");
        // prols.add("Марина Лугова");
        // prols.add("Анна Владимировна");
        // prols.add("Иван Мечников");
        // // prols.add("Пётр Петин");
        // // prols.add("Иван Ежов");
        // int co = 0;
        // for (String s : prols) 
        // {
        //     String name = "";
        //     for (int i = 0; i < s.length(); i++) {
        //         String lett = Character.toString(s.charAt(i));
        //         if (lett.equals(" ")) {
        //             names.add(name);
        //             i = s.length();
        //         }
        //         else { name += lett; }
        //     }
        // }
        // for (String o : names) 
        // {
        //     for (String p : names) { if (o.equals(p)) co++; }
        //     recs.add(co);
        //     co = 0;
        // // Сортировка
        //     for (int i = 0; i<recs.size(); i++) {
        //         int numi = recs.get(i);
        //         String nami = names.get(i);
        //         for (int j = 0; j<recs.size(); j++) 
        //         {
        //             int numj = recs.get(j);
        //             String namj = names.get(j);
        //             if (numi>numj) 
        //             {
        //                 recs.set(j, numi);
        //                 names.set(j, nami);
        //                 recs.set(i, numj);
        //                 names.set(i, namj);
        //                 j = recs.size(); 
        //             }
        //         }
        //     }
        // }
        // for (int r = 0; r < names.size(); r++) {
        //     int call = 0;
        //     int mode = 0;
        //     String rword = names.get(r);
        //     int rnum = recs.get(r);
        //     for (int d = 0; d < names.size(); d++) {
        //         String dword = names.get(d);
        //         int dnum = recs.get(d);
        //         if (rword.equals(dword)) { 
        //             call++; 
        //             if (call > 1) { names.remove(d); }
        //         if (rnum == dnum) { 
        //             mode++; 
        //             if (mode > 1) { recs.remove(d); }
        //         }
        //     }
        // }
        // System.out.println(rword + " - " + rnum + " раз(а)");
    // }
    System.out.println("3. ");
    int[] ray = {4, 10, 3, 5, 1};
    // ray.add(4);
    // ray.add(10);
    // ray.add(3);
    // ray.add(5);
    // ray.add(1);
    // heapso.add(31);
    // heapso.add(53);
    // int si = ray.size();
    heap2(ray);
    System.out.println(Arrays.toString(ray));
    work.close();
}
    public static void heap1(int[] heapso, int si, int i) {
        int pa = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // int cha = heapso[left];
        // int chb = heapso[right];
        if (left < si && heapso[pa] < heapso[left])
            { 
                pa = left; 
            }
        if (right < si && heapso[pa] < heapso[right]) 
            { 
                pa = right; 
            }
        if (pa != i) {
            int temp = heapso[i];
            heapso[i] = heapso[pa];
            heapso[pa] = temp;
            heap1(heapso, si, pa);
        }
    }
    public static void heap2(int[] heapso) {
        if (heapso.length == 0) { 
            return; 
        }
        int si = heapso.length;
        for (int i = si / 2 - 1; i >= 0; i--) { 
            heap1(heapso, si, i); 
        }
        for (int i = si - 1; i >= 0; i--) {
            int temp = heapso[0];
            heapso[0] = heapso[i];
            heapso[i] = temp;
            heap1(heapso, i, 0);
        }
    }
}