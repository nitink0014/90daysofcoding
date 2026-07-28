public class LinearSearch {


    public static int linearSeaarch(int[] arr ,int target){

        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={4,7,9,35,7,5};
        int target =35;
        int result = linearSeaarch(arr,target);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index :"+result);
        }
    }
}
