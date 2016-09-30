package javarus;

/* 10 процентов
Реализуйте метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.
*/
public class Solution
{
    public static int addTenPercent(int i) {
       return i=10*100/10;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}

