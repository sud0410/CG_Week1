import java.util.Scanner;
class Spring{
    int MonthDay(int Month, int Day ){
        if (Month==3 && Day>=20 || Month==4 && (Day>=1 && Day<=30)|| Month == 5 && (Day>=1 && Day<=31)|| Month == 6 && Day<=20){
            System.out.println("It's a Spring Season");
        } else if (Month<0|| Day<0||Day>31||Month>12) {
            System.out.println("Invalid Day/ Invalid Month");
        } else{
            System.out.println("It's not a Spring Season");
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month Number");
        int Mon = sc.nextInt();
        System.out.println("Enter the Day Number");
        int Da = sc.nextInt();
        Spring obj = new Spring();
        int Result = obj.MonthDay(Mon, Da);
    }
}

