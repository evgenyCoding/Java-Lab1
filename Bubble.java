package onpu;
import java.util.*;


public class Bubble {
static Scanner scan = new Scanner(System.in); 
  
public static void main(String[] args) {
  
        int n, array[];        
        System.out.print("Enter size of array: ");
        n = scan.nextInt();
        array = new int [n];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) ( Math.random() * n);        
        	System.out.print("Original array: ");
        	for (int i: array)
            System.out.print(i + " " );
        	
        long startTime = System.nanoTime();	
        sort(array);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(". Time of sort: " + (startTime-estimatedTime ) + " nanosec.");
        }
        static void swap (int[] array, int i, int j) {
            int k = array[i];
            array[i] =array[j];
            array[j] = k;
        }         
        static void sort(int[] array){
            for(int i = array.length-1 ; i >= 0 ; i--){
                for(int j = 0 ; j < i ; j++){
                    if( array[j] > array[j+1] )
                       swap(array, j, j+1);
                }
            }
        System.out.print(". New array: ");    
        for (int i: array)
        System.out.print(i + " " );
        
    }
}