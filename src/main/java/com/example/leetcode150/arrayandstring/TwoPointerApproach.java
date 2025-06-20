package com.example.leetcode150.arrayandstring;

public class TwoPointerApproach {
    public static void main(String[] args) {
        //This is also called slow-fast pointer approach
        // which is often used in problems where you need to process an array in place with minimal extra memory.


        // In place algorthm
       /* The in-place approach means modifying data without using significant additional space,
                and there are various ways to achieve this,
                depending on the problem.*/
        //to implement this inplace  we can use
        //1. Two-pointer Approach in In-place Algorithms:
        //2/ or swapping

        //In place algorithm use cases
  /*      An in-place algorithm is one that transforms the input using only a constant amount of extra space.
  It doesn't require additional significant memory allocation beyond what is needed for the input itself.

        To better understand this concept, let’s look at some real-life scenarios where we can apply in-place algorithms:

        1. Shuffling a Deck of Cards
        Imagine you have a deck of cards and you want to shuffle them.

                In-Place Approach: You can shuffle the deck by swapping cards within the same deck. For example, you pick one card at a time and randomly swap it with another card in the deck. You’re modifying the order of the cards directly in the original deck without needing extra space (like another deck).
        Not In-Place: If you had a second deck, you could take cards from the first deck and place them in random positions in the second one. This approach would use extra memory (the second deck).
        In an in-place algorithm, the shuffling happens directly in the deck you’re given, without using another deck or additional space, except for perhaps a couple of temporary variables to store card positions during swaps.

        2. Rearranging Furniture in a Room
        You want to rearrange furniture in a room to optimize space.

                In-Place Approach: You move each piece of furniture within the same room to its new location. You don't bring in or need extra furniture; you simply shift the existing items to new positions.
        Not In-Place: If you had another room to temporarily store furniture while moving things around, this would use additional space.
        In the in-place approach, you rearrange the furniture directly in the original space, without needing external storage.

        3. Organizing Books on a Shelf
        Imagine you have a shelf with books and you want to organize them alphabetically.

        In-Place Approach: You take each book from the shelf and move it around on the same shelf. For instance, you might compare adjacent books and swap them to get them in order. You don’t need another shelf to do the sorting.
        Not In-Place: You could take all the books off the shelf, sort them on a table, and then put them back in order. This would involve extra space (the table).
                An in-place algorithm works directly on the original shelf, without removing the books elsewhere.

        4. Repacking a Suitcase
        Suppose you’re repacking a suitcase, trying to fit everything in a more organized way.

        In-Place Approach: You rearrange the items directly within the suitcase, moving things around to optimize space without taking them out of the suitcase.
        Not In-Place: If you move everything out of the suitcase, organize it on a bed or floor, and then pack it back in, that would require extra space (the bed or floor).
        In the in-place approach, you modify the arrangement inside the suitcase directly.*/



        /*In Computer Science:
        In computer algorithms, this concept translates to tasks like sorting or modifying an array or list without using any significant extra memory:

        In-Place Sorting Algorithms: Algorithms like Bubble Sort or Insertion Sort sort an array in place by swapping elements within the same array, without needing additional arrays.
                Not In-Place Sorting: Algorithms like Merge Sort require extra memory because they create new sub-arrays to perform sorting.
                Advantages of In-Place Algorithms:
        Memory Efficiency: They minimize the use of additional memory, which is crucial when working with large data sets.
        Speed: Often, they can be faster since they avoid the overhead of allocating and managing extra space.
        In summary, an in-place algorithm directly modifies the input within the original space, just like rearranging furniture in a room or shuffling cards without needing a second deck.
*/

        // QUE...////so it means that to implement in place algorithm approach we need to use two pointer approach right??


       /* Not necessarily! While the two-pointer approach is a common and effective technique used in many in-place algorithms, it’s not the only way to implement in-place algorithms. The in-place approach means modifying data without using significant additional space, and there are various ways to achieve this, depending on the problem.

                Let’s clarify when and how the two-pointer approach is used and show other examples where in-place algorithms don’t require two pointers.

        1. Two-pointer Approach in In-place Algorithms:
        The two-pointer approach is commonly used in problems where you need to rearrange elements, remove duplicates, or modify an array or list while iterating over it. This technique is particularly useful when there’s a need to read and write at different rates, allowing one pointer to traverse (read) the array and another pointer to track where the changes should be made (write).

                Examples of Two-pointer In-place Algorithms:
        Removing Duplicates from Sorted Array: As discussed earlier, one pointer reads through the array (j), and another pointer (i) tracks where the next unique or valid element should be placed.
        Partitioning an Array: When partitioning an array around a pivot (like in QuickSort), two pointers can be used—one moving from the start and the other from the end, swapping elements to rearrange the array.
                Reversing an Array: You can use one pointer at the beginning and one at the end to swap elements in-place until the middle is reached.
                java
        Copy code
        public void reverse(int[] arr) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                // Swap elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                // Move pointers towards the middle
                left++;
                right--;
            }
        }
        2. In-place Algorithms Without Two Pointers:
        Many in-place algorithms don't require two pointers. The key is that you're modifying the data in the original space, but this can be done using other strategies, such as using loops, recursion, or index manipulation.

        Examples of Non-Two-pointer In-place Algorithms:
        In-place Sorting Algorithms:

        Bubble Sort: This algorithm sorts an array by repeatedly swapping adjacent elements if they are in the wrong order, but it only uses a single pointer to traverse the array. It’s still an in-place algorithm because it doesn’t require extra space.
        java
        Copy code
        public void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap adjacent elements
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        Heap Sort:

        Heap sort works by building a max-heap from the array and then sorting the elements by swapping the root of the heap with the last element and then heapifying the remaining array. No extra arrays are used; the array is modified in place, but no two pointers are required.
                In-place Linked List Reversal:

        When reversing a linked list, you don’t need two pointers; instead, you modify the next pointers of each node to reverse the list.
                java

        public ListNodeAddTwoNumbers reverseList(ListNodeAddTwoNumbers head) {
            ListNodeAddTwoNumbers prev = null;
            ListNodeAddTwoNumbers curr = head;
            while (curr != null) {
                ListNodeAddTwoNumbers nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }
        In-place Matrix Rotation:

        Rotating a 2D matrix 90 degrees clockwise or counterclockwise can be done in place by swapping the elements layer by layer without using extra space or two pointers.
                java

        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - i - 1; j++) {
                    // Rotate elements in a 4-way swap
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][i];
                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                    matrix[j][n - i - 1] = temp;
                }
            }
        }
        Conclusion:
        Two-pointer technique is one of many ways to implement in-place algorithms, but it’s not the only way.
                An in-place algorithm simply modifies the data directly in the input structure (e.g., array, list, or matrix) without using significant extra memory.
                The method you choose (two pointers, index manipulation, recursion, etc.) depends on the specific problem you're solving.


*/


    }
}
