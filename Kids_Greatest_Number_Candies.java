import java.util.ArrayList;
import java.util.Scanner;


public class Kids_Greatest_Number_Candies {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = input.nextInt();

        int[] arr = new int[size];

       System.out.println("Enter the elements:");
        for(int i = 0; i< size ; i++){
            arr[i] = input.nextInt();

        }

        System.out.println("Enter the Extra candies:");
        int Extrac = input.nextInt();

      

        System.out.println(solution(arr, Extrac));



    }

    public  static ArrayList<Boolean> solution(int[] arr, int Extrac) {

          ArrayList<Boolean> list = new ArrayList<>();

        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        for(int i =0;i<arr.length;i++){
            if((arr[i] + Extrac) >= max){
                list.add(true);
            }
            else{
                 list.add(false);
            }

        }
        return list;
    }
    
}
