package task1;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите любое значение: ");
        Scanner scan = new Scanner(System.in);
        String result = (scan.nextLine());

        if (result == null || result.isEmpty() || result.equals(" ")) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Ваша строка пуста!");
            }
        }
        else{
            System.out.println("Ваша строка: " + result);
        }
    }
}
