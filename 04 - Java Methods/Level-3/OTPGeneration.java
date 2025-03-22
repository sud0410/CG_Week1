import java.util.Arrays;
public class OTPGeneration {
    public static void main(String[] args){
        int[] otparray = new int[10];
        for(int i = 0 ; i<10;i++){
            otparray[i]=getOTP();
        }
        System.out.println("Generated OTPs");
        System.out.println(Arrays.toString(otparray));
        if(areOTPunique(otparray)){
            System.out.println("All OTPs are unique.");
        }
        else{
            System.out.println("Some OTPs are same");
        }
    }
    public static int getOTP(){
        return (int)(Math.random()*900000)+100000;
    }
    public static boolean areOTPunique(int[] otps){
        for(int i = 0 ; i<otps.length;i++){
            for(int j=i+1;j<otps.length;j++){
                if(otps[i]==otps[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
