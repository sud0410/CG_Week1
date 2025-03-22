import java.util.Scanner;
public class BMI{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Persons");
        int persons = sc.nextInt();
        double[] weightinKg = new double[persons];
        double[] heightinm = new double[persons];
        double[] BM = new double[persons];
        String[] status = new String[persons];
        for (int i=0; i<persons; i++){
            System.out.println("Enter the weight of Person "+(i+1));
            weightinKg[i] = sc.nextDouble();
            System.out.println("Enter the height of Person "+(i+1));
            heightinm[i] = sc.nextDouble();
            BM[i] = weightinKg[i]/(Math.pow(heightinm[i],2));
            if (BM[i]>=40.0){
                status[i] = "Obese";
            } else if (BM[i] >= 25.0 && BM[i] <= 39.9) {
                status[i] = "Overweight";
            } else if (BM[i] >= 18.5 && BM[i] <= 24.9) {
                status[i] = "Normal";
            } else {
                status[i] = "Underweight";
            }
        }
        for(int i=0; i<persons; i++){
            System.out.println("The Person "+(i+1)+" height is "+heightinm[i]+" weight is "+weightinKg[i]+" BMI is "+BM[i]+" and the Status is "+status[i]);
        }
    }
}

