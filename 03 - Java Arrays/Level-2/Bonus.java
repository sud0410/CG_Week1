import java.util.Scanner;
public class Bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Employees: ");
		int emp = sc.nextInt();
		double[] sal = new double[emp];
		double[] yos = new double[emp];
		double[] newsal = new double[emp];
		double[] bonus = new double[emp];
		double totalbonus = 0, totalsalary = 0, totalnewsalary = 0;
		
		for(int i=0; i<emp; i++){
			while(true){
				try{
					System.out.print("Enter the Salary of Employee "+(i+1)+" : ");
					sal[i]=sc.nextDouble();
					System.out.print("Enter the Years of service of Employee "+(i+1)+" : ");
					yos[i]=sc.nextDouble();
					if((yos[i]<0.0)||(sal[i]<0.0)){
						System.out.println("Enter Valid Salary / Valid Years of Experience");
						continue;
					}
					break;
				}
				catch(Exception e){
					System.out.println("Invalid input");
					sc.next();
				}
			}
		}
		for(int i=0;i<emp;i++){
			bonus[i] = (yos[i]>5 ? sal[i]*0.05 : sal[i]*0.02);
			newsal[i] = sal[i] + bonus[i];
			totalbonus += bonus[i];
			totalsalary += sal[i];
			totalnewsalary += newsal[i];
		}
		for(int i=0; i<emp; i++){
			System.out.println("The Employee "+(i+1)+" old salary was "+sal[i]+" with added bonus of "+bonus[i]+" the new salary is "+newsal[i]);
		}
		System.out.println("The old Salary payout was: "+totalsalary);
		System.out.println("The new Salary payout is: "+totalnewsalary);
		System.out.println("The new bonus payout is: "+totalbonus);
	}
}


			
				
			
		
				
					
					
			
			
			
		
		