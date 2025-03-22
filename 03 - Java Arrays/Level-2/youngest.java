import java.util.Scanner;
public class youngest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Friends:");
		int friends = sc.nextInt();
		int[] age = new int[friends];
		double[] height = new double[friends];
		for (int i = 0; i < friends; i++) {
			System.out.println("Type the age and height of Friend "+(i+1));
			age[i] = sc.nextInt();
			height[i] = sc.nextDouble();
		}
		int minage = age[0];
		double maxheight = height[0];
		for (int i = 0; i < friends; i++) {
			if (age[i] < minage) {
				minage = age[i];
			}
		}
		for (int i = 0; i < friends; i++) {
			if (height[i] > maxheight) {
				maxheight = height[i];
			}
		}
		System.out.println("The youngest guy age is: " + minage);
		System.out.println("The tallest guy height is: " + maxheight);
	}
}
