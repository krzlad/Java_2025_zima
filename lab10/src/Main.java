import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Zadanie 1 ---");
        List<String> names = Arrays.asList("Ania", "Tomek", "Ania", "Kasia", "Tomek");
        printUnique(names);


        System.out.println("\n--- Zadanie 2 ---");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        reversePrint(numbers);


        System.out.println("\n--- Zadanie 3 ---");
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        System.out.println(mergeLists(list1, list2));


        System.out.println("\n--- Zadanie 4 ---");
        LinkedList<String> palindrome = new LinkedList<>(Arrays.asList("kajak", "woda", "kajak"));
        System.out.println(isPalindrome(palindrome));


        System.out.println("\n--- Zadanie 5 ---");
        List<Integer> duplicateList = Arrays.asList(10, 20, 10, 30, 20, 40);
        System.out.println(findUniqueElements(duplicateList));


        System.out.println("\n--- Zadanie 6 ---");
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 5, 10, 15, 20, 25));
        System.out.println(findElementsInRange(treeSet, 5, 20));


        System.out.println("\n--- Zadanie 7 ---");
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseQueue(queue);
        System.out.println(queue);


        System.out.println("\n--- Zadanie 8 ---");
        Deque<Integer> symmetricDeque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println(isSymmetric(symmetricDeque));


        System.out.println("\n--- Zadanie 9 ---");
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Arrays.asList(1, 5, 10));
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Arrays.asList(2, 4, 8));
        PriorityQueue<Integer> mergedPQ = mergePriorityQueues(pq1, pq2);
        while (!mergedPQ.isEmpty()) {
            System.out.print(mergedPQ.poll() + " ");
        }
        System.out.println();


        System.out.println("\n--- Zadanie 10 ---");
        Map<Integer, String> mapToReverse = new HashMap<>();
        mapToReverse.put(1, "Java");
        mapToReverse.put(2, "Python");
        mapToReverse.put(3, "Java");
        System.out.println(reverseMap(mapToReverse));


        System.out.println("\n--- Zadanie 11 ---");
        HashMap<Integer, String> mapToCount = new HashMap<>();
        mapToCount.put(1, "Kot");
        mapToCount.put(2, "Pies");
        mapToCount.put(3, "Kot");
        mapToCount.put(4, "Chomik");
        System.out.println(countValueOccurrences(mapToCount));


        System.out.println("\n--- Zadanie 12 ---");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Jeden");
        treeMap.put(3, "Trzy");
        treeMap.put(5, "Pięć");
        treeMap.put(7, "Siedem");
        System.out.println(subMapInRange(treeMap, 3, 5));
    }

    // Zadanie 1
    public static <T> void printUnique(Collection<T> items) {
        items.stream().distinct().forEach(System.out::println);
    }

    // Zadanie 2
    public static <T> void reversePrint(Iterable<T> items) {
        ArrayList<T> tempList = new ArrayList<>();
        for (T item : items) tempList.add(item);
        for (int i = tempList.size() - 1; i >= 0; i--) System.out.println(tempList.get(i));
    }

    // Zadanie 3
    public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // Zadanie 4
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if (list.isEmpty() || list.size() == 1) return true;
        ListIterator<T> forward = list.listIterator();
        ListIterator<T> backward = list.listIterator(list.size());
        for (int i = 0; i < list.size() / 2; i++) {
            if (!forward.next().equals(backward.previous())) return false;
        }
        return true;
    }

    // Zadanie 5
    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

    // Zadanie 6
    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> set, T lowerBound, T upperBound) {
        return new TreeSet<>(set.subSet(lowerBound, true, upperBound, true));
    }

    // Zadanie 7
    public static <T> void reverseQueue(Queue<T> queue) {
        if (queue.isEmpty()) return;
        T element = queue.poll();
        reverseQueue(queue);
        queue.offer(element);
    }

    // Zadanie 8
    public static <T> boolean isSymmetric(Deque<T> deque) {
        if (deque.isEmpty()) return true;
        Iterator<T> forward = deque.iterator();
        Iterator<T> backward = deque.descendingIterator();
        for (int i = 0; i < deque.size() / 2; i++) {
            if (!forward.next().equals(backward.next())) return false;
        }
        return true;
    }

    // Zadanie 9
    public static <T> PriorityQueue<T> mergePriorityQueues(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
        PriorityQueue<T> result = new PriorityQueue<>(queue1);
        result.addAll(queue2);
        return result;
    }

    // Zadanie 10
    public static <K, V> Map<V, K> reverseMap(Map<K, V> map) {
        Map<V, K> reversed = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversed.put(entry.getValue(), entry.getKey());
        }
        return reversed;
    }

    // Zadanie 11
    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> counts = new HashMap<>();
        for (V value : map.values()) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        return counts;
    }

    // Zadanie 12
    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
        return new TreeMap<>(map.subMap(startKey, true, endKey, true));
    }
}