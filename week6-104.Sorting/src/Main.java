import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       //int[] values = {3, 2, 5, 4, 8};

int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
    }
    public static int smallest(int[] array) {
        int[] list = array;
        int smallest = list[0];
        for (int i = 0; i < list.length ;i++) {
            if (smallest > list[i]) {
                smallest = list[i];
                //System.out.print(smallest);
            }
            
        }
        return smallest;
    // write the code here
    } 
    public static int indexOfTheSmallest(int[] array) {
        int[] list = array;
        int smallest = list[0];
        int smallestIndext = 0;
        for (int i = 0; i < list.length ;i++) {
            if (smallest > list[i]) {
                smallest = list[i];
                smallestIndext = i;
            }
            
        }
        return smallestIndext;
    // write the code here
    } 
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] list = array;
        int smallest = list[index];
        int smallestIndext = index;
        for (int i = index; i < list.length ;i++) {
            if (smallest > list[i]) {
                smallest = list[i];
                smallestIndext = i;
            }
            
        }
        return smallestIndext;// write the code here
    }
    
    public static void swap(int[] array, int index1, int index2) {
        //int[] list = array;
        int numb1 = array[index1];
        int numb2 = array[index2];
        array[index1] = numb2;
        
        array[index2] = numb1;
        //value[] value = array[];// code goes here
    }
    
    public static void sort(int[] array) {
        //int[] list = array;
        for (int i = 0; i < array.length ;i++) {
            swap(array,indexOfTheSmallestStartingFrom(array, i), i);
            System.out.println( Arrays.toString(array) );
            }
            
       
    }
}
