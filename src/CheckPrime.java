import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();

        if(isPrime(num)){
            System.out.println(num +" is a prime number.");
        } else{
            System.out.println(num +" is not a prime number");

        }
        input.close();
    }
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


