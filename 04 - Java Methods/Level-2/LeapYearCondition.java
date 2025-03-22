import java.util.Scanner;
public class LeapYearCondition {
    public static boolean IsLeapyear(int year){
        if(year<1582){
            System.out.println("Leap year theory works from 1582 onwards.");
            return false;
        }
        return ((year%400==0)||((year%100!=100) && (year%4==0)));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        boolean leapyear=IsLeapyear(year);
        if(leapyear==true){
            System.out.println(year+" is a Leap year.");
        }
        else{
            System.out.println(year+" is not a Leap year.");
        }
    }
}
