import java.util.Scanner;

public class ValidatingLeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap_year=false;
        System.out.print("Enter the Year value :");
        Scanner sc =new Scanner(System.in);
        year=sc.nextInt();

        if(year % 4 ==0){
            if(year % 100==0){
                if(year % 400==0){
                    leap_year=true;
                }else{
                    leap_year=false;
                }
            }else{
               leap_year=true;
            }

        }else{
            leap_year=false;
        }
        System.out.println("Is The Entered year leap_year ?:"+ leap_year);
    }
}
