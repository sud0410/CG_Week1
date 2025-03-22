import java.util.Scanner;
public class AgeandHeight {
    public static String findyoungest(String[] name,int[] age){
        int minAge= age[0];
        String youngest = name[0];
        for(int i = 1;i<age.length;i++){
            if(age[i]<minAge){
                minAge=age[i];
                youngest=name[i];
            }
        }
        return youngest;
    }
    public static String findtallest(String[] name,int[] height){
        int maxheight = height[0];
        String tallest = name[0];
        for(int i = 1; i<height.length;i++){
            if(height[i]>maxheight){
                maxheight=height[i];
                tallest=name[i];
            }
        }
        return tallest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        int[] age = new int[3];
        int[] height = new int[3];
        System.out.println("Enter the names: ");
        for(int i = 0;i<name.length;i++){
            name[i]=sc.next();
        }
        for(int i = 0;i<name.length;i++) {
            System.out.println("Enter the age of " +name[i]+": ");
            age[i]=sc.nextInt();
            System.out.println("Enter the height of "+name[i]+": ");
            height[i]=sc.nextInt();
        }
        String youngest = findyoungest(name,age);
        String tallest = findtallest(name,height);
        System.out.print("\nThe youngest one is "+youngest);
        System.out.print("\nThe tallest one is "+tallest);
    }
}
