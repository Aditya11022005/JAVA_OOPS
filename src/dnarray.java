import java.util.Scanner;

public class dnarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter the array in postion"+i   );
        num[i] = sc.nextInt();

        }

        System.out.println("Print the Array ..");

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }
    }
}
