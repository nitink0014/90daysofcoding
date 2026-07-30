public class RemoveDuplicates {

    public static int removeDuplicate(int[] arr){

        int i =0;
        for(int j =1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int k = removeDuplicate(arr);
        System.out.println("the Number of unique elements :"+k);
        for(int index =0;index<k;index++){
            System.out.println(arr[index]);
        }
    }
}
