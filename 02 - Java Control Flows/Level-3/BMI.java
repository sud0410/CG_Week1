import java.util.Scanner;
public class BMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		double heightinm = (height/100);
		double BMI = weight/(heightinm*heightinm);
		String Status = "";
		if(BMI<=18.4){
			Status = "Underweight";
		}
		else if(BMI>=18.5 && BMI<=24.9){
			Status = "Normal";
		}
		else if(BMI>=25.0 && BMI<=39.9){
			Status = "Overweight";
		}
		else{
			Status = "Obese";
		}
		System.out.printf("The BMI is %.2f and the Status is %s ",BMI,Status);
	}
}

		