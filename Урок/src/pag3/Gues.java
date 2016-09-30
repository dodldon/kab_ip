package pag3;

/**
 * Демонстрация работы вложеного оператора if
 */
public class Gues {

    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Буква диапазона A-Z");
        System.out.println("Угадать");

        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно");
            if (ch < answer) {
                System.out.println("Дальше");
            } else {
                System.out.println("Ближе");
            }
        }
    }
}
