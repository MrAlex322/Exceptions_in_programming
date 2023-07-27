// Если необходимо, исправьте данный код (задание 2 https:
// //docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package HW_1;

import java.util.Scanner;

public class exercise_3 {
    
    public void method() {
        int x = 0;
        while (x != 1) {

            System.out.println("введите текст:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")) {
                    throw new Exception();
                }
                System.out.println(str);
                System.out.println("Вы молодуц, вы смогли набрать чтото на клавиатуре!!!");
                x = 1;
            } catch (Exception e) {
                {
                    System.out.println("Exception e: Пустые строки вводить нельзя, попробуйте снова!!!");
                }

            }
        }
    }
}
