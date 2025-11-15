import java.util.Scanner;

public class ConvertDay {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number between 1-7:");
        int num= input.nextInt();

        if(num==1){
            System.out.print("1-Monday.");
        }
        else if(num==2){
            System.out.print("2-Tuesday.");
        }
        else if(num==3){
            System.out.print("3-Wendsday.");
        }
        else if(num==4){
            System.out.print("4-Thursday.");
        }
        else if(num==5){
            System.out.print("5-Friday.");
        }
        else if(num==6){
            System.out.print("6-Saturday.");
        }
        else if(num==6){
            System.out.print("7-Friday.");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

