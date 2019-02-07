/**
 * @SeanMacLaughlin
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Give a Number");
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;
        
        for (int i = 0; i <= input; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
