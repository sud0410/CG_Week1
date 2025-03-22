import java.util.Scanner;
public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        if(age<0){
            System.out.println("Invalid age.");
            return false;
        }
        else if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the Ages of the students: ");
        for(int i = 0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        StudentVoteChecker obj = new StudentVoteChecker();
        for(int i =0 ; i<10;i++){
            boolean result = obj.canStudentVote(arr[i]);
            if(arr[i]<0){
                System.out.println("Student " + (i + 1) + " age " + arr[i] + " is invalid age.");
            }
            else if (arr[i]>=18){
                System.out.println("Student " + (i + 1) + " age " + arr[i] + " can vote: " + result);
            }
            else{
                System.out.println("Student " + (i + 1) + " age " + arr[i] + " cannot vote: " + result);
            }
        }
    }
}
