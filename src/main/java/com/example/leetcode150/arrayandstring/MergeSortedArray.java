package com.example.leetcode150.arrayandstring;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        //op [1,2,2,3,5,6]
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}

/*
* what does it mean by merging in-place]
🔧 What does “merging in-place” mean?
In-place means doing something without using extra memory (or with minimal memory). In this context:
Merging in-place means combining nums1 and nums2 directly inside nums1 without creating a new array.
*
*
* 📦 Normally, merging two arrays looks like this:
int[] result = new int[m + n];
// copy and sort elements from nums1 and nums2 into result
That uses extra space for the result array.

✅ But in this problem:
You already have space in nums1 (those trailing zeros), so the goal is to:
Merge everything directly into nums1
Without creating any new arrays
That’s what in-place means: modifying the existing data structure directly.
*

🧠 Why is that better?
Saves memory
Faster (no copying into a new array)
Preferred in coding interviews and real-world large data problems
*
*
Want a one-line analogy?
🧽 In-place is like cleaning your room by organizing stuff in the same room.
🗃️ Not in-place is like moving everything into a new room to sort it.
*
*
*
* QUE....👉 Forward merge = data loss
👉 Backward merge = safe and smart no explain this why in detail...is this is in this problem only or every other problem
*
* 💭 Is This Only For This Problem?
No — it's a general principle.
Whenever you're doing an in-place merge where:
there's buffer space at the end of one array,
and you need to preserve values from the original array,
👉 Go backwards to avoid overwriting values you haven’t finished using.

✅ When You Can Merge Forward:
If you have extra space at the beginning, or
You’re copying into a new array,
Or the arrays are disjoint (e.g., one ends before the other starts),
Then merging forward is fine.
*
* | Situation                                     | Merge Direction | Why                               |
| --------------------------------------------- | --------------- | --------------------------------- |
| In-place with space at the end                | **Backward**    | Avoid overwriting original values |
| Merging into a new array                      | Forward or back | Doesn’t matter                    |
| Arrays are disjoint (e.g., \[1,2] and \[3,4]) | Forward         | Safe — no overlap                 |
| In-place with space at the beginning          | Forward         | Can work, but uncommon setup      |




*
*
*
* */
