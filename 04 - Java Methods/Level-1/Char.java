import java.util.Scanner;
public class Char{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        int vowel = 0;
        int consonants = 0;
        int vowindex = 0;
        int conindex = 0;
        char[] vowarr = new char[str.length()];
        char[] conarr = new char[str.length()];
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    vowel++;
                    vowarr[vowindex++]=ch;
                }
                else{
                    consonants++;
                    conarr[conindex++]=ch;
                }
            }
        }
        System.out.println("The Vowels array contains ");
        for(int i=0; i<vowindex; i++){
            System.out.println(vowarr[i]);
        }
        System.out.println("The Total Vowels were:"+vowel);
        System.out.println("The Consonants array contains ");
        for(int i=0; i<conindex; i++){
            System.out.println(conarr[i]);
        }
        System.out.println("The Total Consonants were:"+consonants);
    }
}