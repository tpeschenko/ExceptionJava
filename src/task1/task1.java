//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.
package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Введите дробное число: ");
        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                Float num = Float.parseFloat(scan.nextLine());
                System.out.println("Отлично, это число: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Это не дробное число! \nВведите число повторно: ");
            }
        }
    }
}
