import java.util.Scanner;
class SimpleInterest {
    double SI(double Principal, double Rate, double time) {
        return (Principal * Rate * time) / 100;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        double P = sc.nextDouble();
        System.out.println("Enter the Rate of Interest");
        double R = sc.nextDouble();
        System.out.println("Enter the Time in Years");
        double T = sc.nextDouble();
        SimpleInterest calcobj = new SimpleInterest();
        double SimpInt = calcobj.SI(P,R,T);
        System.out.println("The Simple Interest is "+SimpInt+" where the Principal Amount is "+P+" Rate is "+R+" and time is "+T+" Years.");
    }
}
