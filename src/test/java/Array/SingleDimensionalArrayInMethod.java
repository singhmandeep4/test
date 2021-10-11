//Passing Array to a Method in Java

package Array;

public class SingleDimensionalArrayInMethod {

   static void min(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={10,20,30,40};
        min(arr);
    }
}
