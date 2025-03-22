import java.util.Scanner;
class pnz{
    int num(int a){
        if(a>0){
            return 1;
        } else if (a<0) {
            return -1;
        }else {
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        pnz obj = new pnz();
        int res = obj.num(number);
        System.out.println("The Result is: "+res);
    }
}
