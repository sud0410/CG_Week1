import java.util.Scanner;
public class BMI {
    public static double findbmi(double weight,double height){
        return weight/((double)(height/100)*(height/100));
    }
    public static String findbmistatus(double bmi){
        if(bmi<=18.4){
            return "Underweight";
        }
        else if(bmi>=18.5 && bmi<=24.9){
            return "Normal";
        }
        else if(bmi>=25.0 && bmi<=39.9){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];
        for(int i = 0;i<10;i++){
            System.out.println("Enter the weight and height of "+(i+1));
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }
        for(int i = 0 ; i<10;i++){
            data[i][2]=findbmi(data[i][0],data[i][1]);
            status[i]=findbmistatus(data[i][2]);
        }
        System.out.println("\nThe person \tWeights(kg)\tHeights(cm)\tbmi\tstatus");
        for(int i = 0 ; i<10; i++){
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t\t%s\n",i+1,data[i][0],data[i][1],data[i][2],status[i]);
        }
    }
}
