public class SecondLargest {
    public static int secondLargest(int[] arr){
        if(arr==null||arr.length<2){
            throw new IllegalArgumentException("Array must contain atleast two elements");
        }
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                slargest = largest;
                largest = num;
            }
            else if(num>slargest && num!=largest){
                slargest = num;
            }
        }
        if(slargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("there no second largest element");
        }

        return slargest;
    }



    public static void main(String[] args){
        int arr[] = {12,35,1,10,34,1};
        System.out.println(secondLargest(arr));
    }
}
