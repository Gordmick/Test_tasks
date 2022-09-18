package test_taks;
import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 7)  {
            System.out.println("Привет");
        }
    }
}
