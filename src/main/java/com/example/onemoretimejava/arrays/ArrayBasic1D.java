package com.example.onemoretimejava.arrays;

public class ArrayBasic1D {
    /*
Que...
for(i in 1..arr2.size){
for(int i=1;i<=arr.lenght();i++)
why in java we use length and in kotlin size

ANS:
ChatGPT
The difference in terminology (length in Java and size in Kotlin) is mainly due to the fact that arrays and collections are treated differently in these two languages.

In Java:
The length property is used for arrays. For example: arr.length.
The length() method is used for strings. For example: str.length().

In Kotlin:
The size property is used for both arrays and collections. For example: arr.size or list.size.
Kotlin strives for consistency, and the use of the size property for both arrays and collections makes the language more uniform and user-friendly.
It helps to have a consistent way of obtaining the size of data structures regardless of whether they are arrays or collections.

In summary, while Java uses different terms (length for arrays and length() for strings),
Kotlin opts for a more consistent approach by using size for both arrays and collections.
This is part of Kotlin's effort to improve and simplify the language syntax.*/
    public static void main(String[] args) {
        //Example using Int
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 1; i <= arr.length; i++) {
            //  System.out.println(" " + i);
        }

        int[] arr2 = new int[5];
        arr2[0] = 21;
        arr2[1] = 22;
        arr2[2] = 23;
        arr2[3] = 24;
        arr2[4] = 25;

        for (int i = 0; i <= arr2.length - 1; i++) {
          //  System.out.println(arr2[i]);
        }
        System.out.println();
        //Example using Strings
        String[] str = new String[5];
        str[0] = "jhon";
        str[1] = "cena";
        str[2] = "edge";
        str[3] = "randy";
        str[4] = "ortan";

        for (int i = 0; i <= str.length - 1; i++) {
        //    System.out.println(str[i]);
        }

        String ssd = "Pranay";
        for (int i = 0; i < ssd.length(); i++) {
            System.out.println(ssd.charAt(i));
        }


    }
}
