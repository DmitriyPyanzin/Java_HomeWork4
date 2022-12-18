import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    /*
     * 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     * private static <T> List<T> reverse(LinkedList<T> source) {
     *    return null;
     * }
     */

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        LinkedList<String> linkedList = new LinkedList<>();
        t2.fillList(linkedList);
        System.out.println(linkedList);
        System.out.println(t2.reverse(linkedList));
    }

    private <T> List<T> reverse(LinkedList<T> source) {
        LinkedList<T> newList = new LinkedList<>();
        int len = source.size();
        for (int i = 0; i < len; i++) {
            newList.add(source.getLast());
            source.removeLast();
        }
        return newList;
    }

    private <T> void fillList(LinkedList<T> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой длины будет список?");
        int len = sc.nextInt();
        System.out.println("Заполняем список");
        for (int i = 0; i < len; i++) {
            list.add((T) sc.next());
        }
    }
}
