import java.util.Scanner;
public class QuadraticEquation {
    public static double[] ComputeEquation(double a , double b , double c){
        double delta =  (Math.pow(b,2))-(4*a*c);
        if(delta>0){
            double root1=((-b)+Math.sqrt(delta))/(2*a);
            double root2=((-b)-Math.sqrt(delta))/(2*a);
            return new double[]{root1,root2};
        }
        else if(delta==0){
            double root = (-b/(2*a));
            return new double[]{root};
        }
        else{
            return new double[]{};
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        double a = sc.nextDouble();
        System.out.println("Enter b ");
        double b = sc.nextDouble();
        System.out.println("Enter c ");
        double c = sc.nextDouble();
        double[] roots = ComputeEquation(a,b,c);
        if(roots.length==0){
            System.out.println("No roots.");
        }
        else if(roots.length==1){
            System.out.println("One root "+roots[0]);
        }
        else{
            System.out.println("Two roots "+roots[0]+" and "+roots[1]);
        }
    }
}
