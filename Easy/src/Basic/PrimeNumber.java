import java.util.*;
public class PrimeNumber {
   
    public static void main(String[] args) {
        System.out.println("check your prime number");
        int n,count=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number :");
         n=input.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
