import java.util.Scanner;
public class Reverse_Vowels_String{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = input.nextLine();

        String result = reverse(s);

        System.out.println(result);

        input.close();
    }

    private static String reverse (String s) {
        char[] arr = s.toCharArray();

        int left = 0 , right = s.length()-1;
        while(left < right){
            if(!isVowel(arr[left])){
                left++;
                continue;
            }

            if(!isVowel(arr[right])){
                right--;
                continue;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        return new String(arr);
    }

             private static boolean  isVowel(char c){
           return c == 'a' || c == 'e'|| c == 'i'||c == 'o' || c == 'u'|| 
                  c == 'A'||c == 'E' ||c ==  'I'||c ==  'O'||c == 'U';
    }

}
    

