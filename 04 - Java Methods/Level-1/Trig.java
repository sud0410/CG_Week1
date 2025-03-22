import java.util.Scanner;
class Trig{
    public double[] calculateTrigonometricFunctions(double angle){
        double Radians = Math.toRadians(angle);
        double Sine = Math.sin(Radians);
        double Cosine = Math.cos(Radians);
        double Tangent = Math.tan(Radians);
        return new double[]{Sine, Cosine, Tangent};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double ang = sc.nextInt();
        Trig obj = new Trig();
        double[] res = obj.calculateTrigonometricFunctions(ang);
        System.out.println("The angle "+ang+"in Sine, Cosine, Tangent "+res[0]+","+res[1]+","+res[2]);
    }
}
