import java.util.Scanner; // импортируем библиотеку для ввода данных с клавиатуры
public class TestAuthor { // создаём класс для теста
    public static void main(String[] args) {
        String new_email;
        // Создаём экземпляр класса Author
        Author author = new Author("Darya Novozhilova", "novojilovadasha@mail.ru", 'F');
        System.out.println(author); // выводим экземпляр
        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        System.out.println("Enter new email: ");
        new_email = sc.nextLine(); // считываем с потока ввода строку - email
        author.setEmail(new_email); // с помощью setter'а изменяем в экземпляре значение объекта email
        System.out.println(author); // выводим измененный экземпляр
        System.out.println("Name: " + author.getName()); // с помощью getter'а получаем значение объекта name из экземпляра класса

    }
}
