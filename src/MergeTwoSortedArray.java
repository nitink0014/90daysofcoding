public class MergeTwoSortedArray {

    public static int[] merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] result = new int[n+m];

        int i =0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            result[k]=arr1[i];
                    i++;
            k++;
        }

        while(j<m){
            result[k]=arr2[j];
            j++;
            k++;
        }


        return result;

    }



    public static void main(String[] args) {
        int[] arr1 ={1,3,5,7};
        int[] arr2 ={2,4,6,8};
        int[] result = merge(arr1,arr2);

        for(int num : result){
            System.out.print(num+" ");
        }

    }
}
