package com.example.onemoretimekotlin

fun main() {
    val list = arrayOf(1, 4, 3, 2, 7, 5)
    //println(binarySearch(list, 4))
    selectionSort(list)
    println(list.joinToString())
}

//Binary Search
fun binarySearch(list: Array<Int>, target: Int): Int {
    var start = 0
    var end = list.size - 1
    while (start <= end) {
        val mid = (start + (end - start) / 2)
        if (target < list[mid]) {
            end = mid - 1;
        } else if (target > list[mid]) {
            start = mid + 1
        } else {
            return mid
        }
    }
    return -1;
}

fun bubbleSort(list: Array<Int>) {
    val n = list.size
    var swapped: Boolean
    for (i in 0 until n) {
        swapped = false
        for (j in 1 until (n - i)) {
            if (list[j] > list[j - 1]) {
                swap(list, j, j - 1)
                swapped = true
            }


        }
        if (!swapped) {
            break
        }
    }
    // for(int j=1;j<n-i;j++)

}

fun insertionSort(list: Array<Int>) {
    val n = list.size - 1
    for (i in 0 until n) {
        for (j in i + 1 downTo 1) {
            //for(int j=i+1;j>0;j--)
            if (list[j] < list[j - 1]) {
                swap(list, j, j - 1)
            } else {
                break
            }

        }
    }
}

fun selectionSort(list: Array<Int>) {
    val n = list.size
    for (i in 0 until n) {
        val last = n - i - 1
        val max = maxIndex(list, 0, last)
        swap(list, max, last)
    }

}

fun swap(list: Array<Int>, first: Int, sec: Int) {
    val temp = list[first]
    list[first] = list[sec]
    list[sec] = temp
}

fun maxIndex(list: Array<Int>, first: Int, sec: Int): Int {
    var max = first
    for (i in first .. sec) {
        if (list[max] < list[i]) {
            max = i;
        }
    }
    return max

}