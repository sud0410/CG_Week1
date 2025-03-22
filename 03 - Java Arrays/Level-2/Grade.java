import java.util.Scanner;
public class Grade{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        double[][] marks = new double[students][4];
        String[] Grade = new String[students];
        for(int i=0; i<students; i++){
            System.out.println("Enter the Physics Mark of Student-"+(i+1));
            marks[i][0] = sc.nextDouble();
            System.out.println("Enter the Chemistry Mark of Student-"+(i+1));
            marks[i][1] = sc.nextDouble();
            System.out.println("Enter the Math Mark of Student-"+(i+1));
            marks[i][2] = sc.nextDouble();
            marks[i][3] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
        }
        for (int i=0; i<students; i++){
            if (marks[i][3]>=80){
                Grade[i]="A";
            } else if (marks[i][3]>=70 && marks[i][3]<80) {
                Grade[i]="B";
            } else if (marks[i][3]>=60 && marks[i][3]<70) {
                Grade[i] = "C";
            } else if (marks[i][3]>=50 && marks[i][3]<60) {
                Grade[i] = "D";
            } else if (marks[i][3]>=40 && marks[i][3]<50) {
                Grade[i] = "E";
            }
            else {
                Grade[i] = "R";
            }

        }
        for(int i=0; i<students; i++){
            System.out.println("The Student-"+(i+1)+" Marks in Physics, Chemistry & Maths are "+marks[i][0]+","+marks[i][1]+","+marks[i][2]+" respectively.");
            System.out.println("The average marks of student-"+(i+1)+" is "+String.format("%.2f",marks[i][3])+" and the grade is "+Grade[i]);
        }
    }
}

