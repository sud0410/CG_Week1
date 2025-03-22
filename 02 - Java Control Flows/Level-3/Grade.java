import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int mathmark = sc.nextInt();
		int phymark = sc.nextInt();
		int chemmark = sc.nextInt();
		double Average = (mathmark+phymark+chemmark)/3;
		String Grade = "";
		String Remark = "";
		if(Average >= 80){
			Grade = "A";
			Remark = ("Level 4, above agency-normalized standards");
		}
		else if(Average >= 70 && Average <=79){
			Grade = "B";
			Remark = ("Level 3, at agency-normalized standards");
		}
		else if(Average >= 60 && Average <=69){
			Grade = "C";
			Remark = ("Level 2, below, but approaching agency-normalized standards");
		}
		else if(Average >= 50 && Average <=59){
			Grade = "D";
			Remark = ("Level 1, well below agency-normalized standards");
		}
		else if(Average >= 40 && Average <=49){
			Grade = "E";
			Remark = ("Level 1, too below agency-normalized standards");
		}
		else{
			Grade = "R";
			Remark = (")Remedial standards)");
		}
		System.out.println("The Student's Average marks is "+Average+" and Grade is "+Grade);
		System.out.println("The Remarks is "+Remark);
	}
}

