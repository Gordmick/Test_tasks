package test_taks;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        String name = "Вячеслав";
        Scanner console = new Scanner(System.in);
        String input_name = console.nextLine();
        if (name.equals(input_name)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
