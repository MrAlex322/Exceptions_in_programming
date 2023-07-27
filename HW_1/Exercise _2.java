// Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package HW_1;
import java.util.Scanner;


public class Exercise_2 {
    public void method() {
        int x = 0;
        while (x != 1) {
            System.out.println("Введите число: ");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println(number);
                System.out.println("Все верно, идем дальше!");
                x = 1;

            } catch (Exception NumberFormat) {
                System.out.println("Exception NumberFormat: Строки вводить нельзя, попробуйте ещё раз!");
            }
        }
    }
}
