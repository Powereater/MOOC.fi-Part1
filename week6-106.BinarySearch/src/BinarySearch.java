public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        if (searchedValue < array[beginning]){
            return false;
        }
        if (searchedValue == array[end]){
            return true;
        }
        if (searchedValue > array[end]){
            return false;
        }
        if (searchedValue == array[beginning]){
            return true;
        }
        
        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (middle == beginning) {
                return false;
            }
             if (middle == end) {
                return false;
            }
            if (array[middle] == searchedValue) {
                return true;
            }
            if (array[middle] < searchedValue) {
                beginning = middle;
            }
            if (array[middle] > searchedValue) {
                end = middle;
            }
            if (beginning == end && array[middle] != searchedValue) {
                return false;
            }
           

            // restrict the search area 
        }
        return false;
    }
}
