package Task1;

import java.util.*;

public class Main {

    /*
     * 1. Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида
     * text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
     * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
     * > first~1
     * > third~3
     * > print~1
     * < first
     * > print~2
     * < throw new IllegalArgumentException(); (напечатать, что такого элемента нет)
     */

    public static void main(String[] args) {
        TextsMethods textMethods = new TextsMethods();
        Methods methods = new Methods();
        Scanner sc = new Scanner(System.in);
        String str;
        LinkedList<String> arrayList = new LinkedList<>();
        textMethods.greeteng();

        do {
            textMethods.mainMenu();
            str = sc.nextLine();

            if ("quit".equals(str)) {
                System.out.println();
                System.out.println("До встречи!");
            } else if ("help".equals(str)) {
                textMethods.help();
            } else if ("print".equals(str)) {
                methods.printList(arrayList);
            } else if ("clear".equals(str)) {
                methods.clearList(arrayList);
            } else {
                if (!str.contains("~")) {
                    System.out.println("Запись введена в неверном формате, попробуйте еще!");
                    System.out.println();
                } else {
                    List<String> tempList = Arrays.asList(str.split("~"));
                    if (!methods.isInteger(tempList)) {
                        System.out.println("Запись введена в неверном формате, после '~' должно стоять число");
                        System.out.println();
                    } else {
                        int index = Integer.parseInt(tempList.get(1)) - 1;
                        if (tempList.get(0).equals("print")) {
                            methods.printListElement(arrayList, index);
                        } else if (tempList.get(0).equals("remove")) {
                            methods.removeListElement(arrayList, index);
                        } else {
                            methods.addElement(arrayList, index, tempList);
                        }
                    }
                }
            }
        } while (!str.equals("quit"));
        sc.close();

        textMethods.mySignature();
    }
}
