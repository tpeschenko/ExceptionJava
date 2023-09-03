//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.
package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Ваше число " + myNumber());

    }
    public static Float myNumber(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Введите дробное число:");
            String number = scan.nextLine();

            if(number.matches("[0-9]*\\.[0-9]+")){
                Float num = Float.parseFloat(number);
                return num;
            }else{
                System.out.println("Это значение недробное");
            }
        }
    }
}
