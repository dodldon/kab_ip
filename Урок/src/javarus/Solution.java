package javarus;

/* 
Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. 
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9
Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.
Пример вывода:
104.0
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double f;
        f = (double) celsium;
        double c = 9*(f / 5) + 32;
        return c;

    }
}
