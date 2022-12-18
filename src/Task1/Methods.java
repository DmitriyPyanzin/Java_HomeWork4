package Task1;
import java.util.LinkedList;
import java.util.List;

public class Methods {

    public boolean isInteger(List<String> list) {
        try {
            Integer.parseInt(list.get(1));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void printList(LinkedList<String> list) {
        if (list.size() == 0) {
            System.out.println("Cписок не сформирован");
            System.out.println();
        } else {
            System.out.println(list);
            System.out.println();
        }
    }

    public void clearList(LinkedList<String> list) {
        if (list.size() == 0) {
            System.out.println("Список пустой");
            System.out.println();
        } else {
            list.clear();
            System.out.println("Список очищен");
            System.out.println();
        }
    }

    public void printListElement(LinkedList<String> list, int index) {

        if (list.size() <= index || list.get(index) == null) {
            System.out.println("Нет элемента в списка с таким индексом");
            System.out.println();
        } else {
            System.out.println(list.get(index));
            System.out.println();
        }
    }

    public void removeListElement(LinkedList<String> list, int index) {
        if (list.size() < index || list.get(index) == null) {
            System.out.println("Нет элемента в списка с таким индексом");
            System.out.println();
        } else {
            list.remove(index);
            System.out.println("Элемент списка удален");
            System.out.println();
        }
    }

    public void addElement(LinkedList<String> list, int index, List<String> temp) {
        if (list.size() <= index) {
            for (int i = list.size(); i <= index; i++) {
                list.add(null);
            }
        }
        if (list.get(index) == null) {
            list.add(index, temp.get(0));
            System.out.println("Элемент добавлен");
            System.out.println();
        } else {
            System.out.println("Место в списке занято");
            System.out.println();
        }
    }
}
