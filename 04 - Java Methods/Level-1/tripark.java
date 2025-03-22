import java.util.Scanner;

class tripark{
    double rounds(double a, double b, double c){
        double per = a+b+c;
        return(Math.ceil((5/per)));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side-1 in km");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        tripark obj = new tripark();
        double NoofRounds = obj.rounds(side1, side2, side3);
        System.out.printf("Number of Rounds to complete 5Km in the Triangular park is: %d",(int)NoofRounds);
    }
}