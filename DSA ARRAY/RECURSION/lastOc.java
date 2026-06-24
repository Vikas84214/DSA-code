package RECURSION;

public class lastOc {

    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i +1);
    
        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 5, 6 ,5 ,6, 7, 8, 5, 0, 3};

        System.out.println(lastOccurance(arr, 5, 0));
    }
}
