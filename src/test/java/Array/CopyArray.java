package Array;

public class CopyArray {

    public static void main(String args[]){

        char arr[]= {'a','b','c','d','e','f','g'};

        System.out.println("Before copy array");
        for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
                System.out.print("\t");
        }
        System.out.println("\n");

        System.out.println("After copy array");
        char copyArray[] =new char[3];
        System.arraycopy(arr,1,copyArray,0,3 );
        System.out.println(String.valueOf(copyArray));
    }

}
