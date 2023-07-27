// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package HW_1;

public class Exercise_1 {
    public static void main(String[] args) {

        // небыл задан массив
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        try {
            // на 0 делить нельзя!
            // int d = 0;
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}