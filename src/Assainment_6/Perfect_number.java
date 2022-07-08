package Assainment_6;
import java.util.Scanner;
public class Perfect_number {
    public static void main(String[] args) {

        int n,  Sum = 0 ;
        Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number: ");
        n = sc.nextInt();

		for(int i = 1 ; i < n ; i++) {
        if(n % i == 0)  {
            Sum = Sum + i;
        }
    }
		if (Sum == n) {
        System.out.format(n+" is a Perfect Number");
    }
		else {
        System.out.format(n+" is not a Perfect Number");
        }
    }
}
