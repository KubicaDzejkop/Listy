import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Pomarańcza");
        arrayList.add("Banan");
        arrayList.add("Jabłko");
        arrayList.add("Gruszka");
        arrayList.add("Winogrono");
        arrayList.add("Wiśnia");
        arrayList.add("Czereśnia");

        for(String fruits: arrayList) {
            System.out.println(fruits);
        }
        System.out.println("-------------------");

        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(arrayList);

        System.out.println("-------------------");
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Wiśnia"));

        System.out.println("-------------------");
        System.out.println(arrayList.remove("Banan"));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);

        System.out.println("-------------------");
        arrayList.set(2, "agrest");
        System.out.println(arrayList);

        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Pigwa");
        arrayList1.add("Dynia");
        System.out.println("-------------------");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        System.out.println("-------------------");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList = Arrays.asList(4, 1, 0, 8, 17, 76);
        System.out.println(linkedList);

        System.out.println("-------------------");
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int1.compareTo(int2);
            }
        });
        System.out.println(linkedList);


    }
}