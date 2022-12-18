package Task1;

public class TextsMethods {
    public void greeteng() {
        System.out.println();
        System.out.println("""
                Добро пожаловать!
                С помощью данного приложения можно систематизировать строки в определенном порядке,
                а также удалять их или переписывать.""");
        System.out.println();
    }
    public void help() {
        System.out.println();
        System.out.println("""
                 Справка:
                 - строка формата текст~номер позволит разместить строку на определенную позицию
                   если формат введения неправильный, программа попросит вас ввести текст вновь
                   если на указанной позиции уже находится объект, то текст не сохраниться
                   и появится уведомление, что позиция занята;
                 - print~номер - выводит текст по указанному номеру позиции
                   если на указанной позиции отсутствует текст то появится уведомление что на данной позиции ничего нет;
                 - print - выводит весь список фраз
                   если список пуст, то появится уведомление, что список не сформирован;
                 - remove~номер - удаляет текст по указанной позиции
                   если позиция пуста, то появится уведомление что на данной позиции ничего нет;
                 - clear - очищает список
                   если список пуст, то появится уведомление, что список пустой;
                 - help - вызов справки;
                 - quit - завершение программы.""");
        System.out.println();
    }

    public void mainMenu() {
        System.out.println("""
                Введите команду:
                text~number
                print~number
                print
                remove~number
                clear
                quit
                help для вызова справки""");
        System.out.println();
    }

    public void mySignature() {
        System.out.println();
        System.out.println("________________________");
        System.out.println("the program was implemented by Dmitry Pyanzin");
        System.out.println("________________________");
        System.out.println();
    }
}
