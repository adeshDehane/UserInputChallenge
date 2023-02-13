import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAverage();
    }
    public static void inputThenPrintSumAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum=0,count=0;
        double average=0;

        while(true){
            System.out.println("Enter the numbers");
            boolean isInt=scanner.hasNextInt();
            if(isInt){
                int number=scanner.nextInt();
                count++;
                sum += number;
            }
            average=Math.round((double) sum /(double) count);
            System.out.println("SUM = "+ sum + "AVG = "+average);
        }

    }
}
