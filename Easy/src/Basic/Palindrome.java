import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
      int n,r,s=0,c;

        System.out.print("Enter any number ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;

        while(n>0){
           r=n%10;
           s=(s*10)+r;
           n=n/10;
        }
        if(c==s){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome number");
        }
    }
}
