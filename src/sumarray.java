public class sumarray {

    public static void main(String[] args) {

        int numbers[] = {12,4,56,67,89,890,};
        int sum =0;

        for (int num:numbers){

            sum +=num;
        }
        System.out.println("Array sum is : " + sum);
    }
}
