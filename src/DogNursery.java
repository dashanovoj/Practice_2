/* Создание класса тестера под названием ПитомникСобак,
реализует массив собак и основной метод этого класса позволяет добавить в него несколько объектов собаки. */
import java.util.Scanner; // импортируем библиотеку для ввода данных с клавиатуры
public class DogNursery { // Класс тестер
    public static void main(String[] args) {
        int amount; // количество собак в питомнике
        System.out.println("Введите количество собак в питомнике: ");

        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        amount = sc.nextInt(); // считываем с потока ввода количество собак в питомнике

        Dog[] dogs = new Dog[amount]; // создаём массив экземпляров класса Dog

        for (int i = 0; i < amount; i++) {
            dogs[i] = new Dog(); // создаём экземпляр класса Dog

            System.out.println("Введите кличку собаки: ");
            String name = sc.next(); // считываем с потока ввода кличку собаки
            dogs[i].setName(name); // с помощью setter'а изменяем в экземпляре значение объекта name

            System.out.println("Введите возраст собаки: ");
            int age = sc.nextInt(); // считываем с потока ввода возраст собаки
            dogs[i].setAge(age); // с помощью setter'а изменяем в экземпляре значение объекта age
        }

        // Выводим характеристики собак из питомника
        System.out.println("Питомник");
        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + " собака\n"+ dogs[i]);
        }
    }
}
