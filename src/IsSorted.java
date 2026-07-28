public class IsSorted {
    public static boolean issorted(int[] arr){
        if(arr==null||arr.length<1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6};
    if(issorted(arr)){
        System.out.println("Array is Sorted");
    }else{
        System.out.println("Array is Unsorted");
    }
    }
}
