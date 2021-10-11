package Array;

import java.util.Arrays;
import java.util.List;

public class ArrayFunctions {

    public static void main(String args[]){

        int arr[]={30,40,25,20,10,60};

        String str[]={"abc", "cde","xyz"};

        // asList()
        List list=Arrays.asList(str);
        System.out.println("asList function : " + list);

       // toString(originalArray)
        System.out.println("toString function :" + Arrays.toString(arr));

        //binarySearch() and sort() ,
        Arrays.sort(arr);
        int value=25;
        System.out.println("Search value at index: " + Arrays.binarySearch(arr,value) );

       /* //sort(originalArray, fromIndex, endIndex)
        Arrays.sort(arr,1,4);
        System.out.println(Arrays.toString(arr));*/


        // copyOf(originalArray, newLength)
        System.out.println("Array before copy : " + Arrays.toString(arr));
        System.out.println("New array : " + Arrays.toString(Arrays.copyOf(arr, 10)));

        //copyOfRange(originalArray, fromIndex, endIndex)
        System.out.println("New Array from specific range : " + Arrays.toString(Arrays.copyOfRange(arr,2,8)));

        //equals(array1, array2)
        int arr1[]={30,25,20,10};
        System.out.println("Compare array : " + Arrays.equals(arr,arr1));
    }
}
