import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;


        Scanner input=new Scanner(System.in);
        System.out.print("Input Number: ");
        n=input.nextInt();


        if(n>=1&& n<=100){
            if(n % 2==1){
                System.out.println("Weird");
            }
            else if((n % 2==0) && (n>=2 && n<=5)){
                System.out.println("Not Weird");
            }
            else if((n % 2==0) && (n>=6 && n<=20)){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Check Number");
        }

    }
}
