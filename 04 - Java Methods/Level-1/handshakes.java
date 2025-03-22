import java.util.Scanner;
class handshakes{
    int hand(int n){
        return (n*(n-1))/2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Person");
        int Persons = sc.nextInt();
        handshakes per = new handshakes();
        int NoofHandshakes = per.hand(Persons);
        System.out.println("The total possible Handshakes is: "+NoofHandshakes);
    }
}
