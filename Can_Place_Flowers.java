import java.util.Scanner;

public class Can_Place_Flowers{

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements:");
        for(int i =0; i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the flowerbed");
        int flowerbed = input.nextInt();
        boolean result = canplaceflowers(arr,flowerbed);
        System.out.println(result);

    }

    public static boolean canplaceflowers(int[] arr , int flowerbed) {
        for(int i =0;i<arr.length;i++){
            if(arr[i] ==0){
                boolean leftempty = (i ==0) || (arr[i -1]==0);
                boolean rightempty = (i == arr.length -1) || (arr[i + 1] ==0);
                
                if(leftempty && rightempty){
                    arr[i] = 1;
                    flowerbed--;

                    if(flowerbed ==0){
                        return true;
                    }
                }
            }
        }
        return flowerbed <= 0;
       
    }
    
}