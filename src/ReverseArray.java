public class ReverseArray {

    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
int[] arr = {1,2,3,4,5,6,7};
int[] arr1 = reverseArray(arr);
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
