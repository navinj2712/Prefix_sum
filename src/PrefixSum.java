import java.util.Scanner;

public class PrefixSum {

    public static int[] findPrefixSum(int[] array){
        int size = array.length;
        for(int i = 1; i < size; i++){
            array[i] = array[i-1] + array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int[] outputArray = findPrefixSum(array);
        System.out.println("Output : ");
        for(int i = 0; i < size; i++){
            System.out.println(outputArray[i] + " ");
        }
    }
}
