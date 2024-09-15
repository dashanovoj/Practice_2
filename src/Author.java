/* По диаграмме класса UML описывающей сущность Автор.
Необходимо написать программу, которая состоит из двух классов Author и
TestAuthor. Класс Author должен содержать реализацию методов,
представленных на диаграмме класса на рисунке 2.4. */

public class Author { // создаём класс, в котором определим характеристики автора
    /* Переменные класса, модификатор которых - private =>
    невозможно изменение данных в поле кода */
    private String name;
    private String email;
    private char gender;

    // Создаём конструктор класса Author для создания его "каркаса"
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter - метод для получения данных, доступ к которым напрямую ограничен (private)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter - метод для изменения данных, доступ к которым напрямую ограничен
    public void setEmail(String email) {
        this.email = email;
    }

    /* Перераспределение, которое позволяет использовать метод toString
    конкретно для вывода характеристик автора */
    @Override
    public String toString() { // метод для получения текстового описания объекта
        return "Author {" +
                "name = " + name +
                ", email = " + email +
                ", gender = " + gender +
                '}';
    }
}
