/* Напишите программу, которая меняет местами элементы
одномерного массива из String в обратном порядке. Не используйте
дополнительный массив для хранения результатов. */
import java.util.Arrays; // импортируем библиотеку для операций с массивами
import java.util.Scanner; // импортируем библиотеку для ввода данных с клавиатуры
public class ReverseArray {
    // Создаём метод для реверса массива
    public static void reverseArray(String[] arr) {
        int left = 0; // начало массива
        int right = arr.length - 1; // конец массива

        while (left < right) {
            // Меняем местами элементы с индексами left (начало) и right (конец)
            String temp = arr[left]; // создаём временную переменную для обмена значений
            arr[left] = arr[right]; // начальный элемент становится конечным
            arr[right] = temp; // конечный - начальным

            // Переходим к следующей паре элементов
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner, связываем со стандартным потоком ввода (клавиатура - System.in)
        System.out.println("Введите размер строчного массива: ");
        int size = sc.nextInt(); // получаем размер массива
        String [] words = new String[size]; // создаём массив строк размером size
        for (int i = 0; i < size; i++) {
            words[i] = sc.next(); // считываем с потока ввода слова
        }
        System.out.println("Исходный массив: " + Arrays.toString(words));
        reverseArray(words); // используем метод reverseArray для реверса массива
        System.out.println("Измененный массив: " + Arrays.toString(words));
    }
}
