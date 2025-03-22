import java.util.Scanner;
public class Euclidean {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance=Euclideandistance(x1,y1,x2,y2);
        System.out.printf("Euclidean distance is %.2f",distance);
        double[] line = findLineequation(x1,y1,x2,y2);
        System.out.printf("\nEquation of the line: y = %.2fx + %.2f\n",line[0],line[1]);

    }
    public static double Euclideandistance(double x1,double y1,double x2,double y2){
        double distance = Math.sqrt(Math.pow(x2-x1,2))+Math.sqrt(Math.pow(y2-y1,2));
        return distance;
    }
    public static double[] findLineequation(double x1,double y1,double x2,double y2){
        double[] result = new double[2];
        double m = (y2-y1)/(x2-x1);
        double b = y1-m*x1;
        result[0]=m;
        result[1]=b;
        return result;
    }
}
