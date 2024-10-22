import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        
        System.out.println("Hello Even & Odd");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number :");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("this is a even number");
        }else{
            System.out.println("this is a odd number");
        }
    
        input.close();
    }
}
