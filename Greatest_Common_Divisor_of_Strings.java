import java.util.Scanner;

public class  Greatest_Common_Divisor_of_Strings{
public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter word1 :");
    String str1 = input.nextLine();
    System.out.print("Enter word2 :");
    String str2 = input.nextLine();

    String result = gcd(str1 , str2);
    System.out.println("GCD_String:" + result);


    input.close();
}

   

public static String gcd(String str1 , String str2){

    if(!(str1 + str2).equals(str2 + str1)) return "";

    int a = str1.length();
    int b = str2.length();

    while(b != 0){
        int r = b;
        b = a % b;
        a = r;
    }


    return str2.substring(0, a);
    
}

}



