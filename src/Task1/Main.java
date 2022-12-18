import java.util.Scanner;

public class Task1 {

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
        Task1 t1 = new Task1();
        Methods1 methods1 = new Methods1();
        Scanner sc = new Scanner(System.in);

        methods1.greeteng();
        methods1.help();


        String str;
//        do {
//            t1.mainMenu();
//        } while (!str.equals("quit"));
        sc.close();
    }


}
