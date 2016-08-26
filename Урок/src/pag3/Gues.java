package pag3;

/**
 * Демонстрация вложения if
 */
public class Gues {

    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Буква диапазона A-Z");
        System.out.println("Угадать");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("Правельно");
        } else {
            System.out.println("неправильно");
        }
        if (ch < answer) {
            System.out.println("дальше");
        } else {
            System.out.println("ближе");
        }
    }
}
