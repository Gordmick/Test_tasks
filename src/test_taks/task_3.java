package test_taks;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int length = input.nextInt();
        int array[] = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
            if ((array[i] % 3 == 0) && (array[i] != 0)) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.print("- элементы массива кратные 3");
    }
}