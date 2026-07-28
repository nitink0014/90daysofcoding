public class SecondSmallest {

    public static int secondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for(int i =0 ; i <arr.length;i++){
            if(arr[i]<smallest){
                sSmallest = smallest;
                smallest=arr[i];
            }else if (arr[i]<sSmallest && arr[i]!=smallest){
                sSmallest = arr[i];

            }
        }
        if(sSmallest==Integer.MAX_VALUE){
            throw new IllegalArgumentException("There is no Second Smallest element");
        }

        return sSmallest;
    }

    public static void main(String[] args){
        int arr[] = {4,6,2,1,7};
        int result = secondSmallest(arr);
        System.out.println(result);
    }
}
