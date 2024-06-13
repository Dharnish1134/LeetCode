# LeetCode
Daily challenges - June 12/2024

## 1.SortColours(Variation of Dutch National Flag Problem)
**Desription:** Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.You must solve this problem without using the library's sort function.

**Approach:** Given only "0,1,2" will exist in the array sorting will be such that there is always "0" on the left end and "2" on the right end. So we are using two pointers to ensure 0's end up on the left and 2's end up on the right which will automatically leave 1's in the middle giving us a sorted array.This approach has a time complexity of O(n) and a average runtime of 0ms.
 
>Note:We can also use Bubble sort which had a time complexity O(n<sup>2</sup>) and average runtime of 4ms.

## 2.Minimum Number of Moves to Seat Everyone
**Description:** There are n seats and n students in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.You may perform the following move any number of times:
Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1).Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.

**Approach:** To find the minimum movement a student has to make to satisfy the condition,we can sort both the arrays which will result in the nearest seat for each student being stored in each index of the seats array.Now we can add the difference between the student position and seat position at each index to get the minimum cost.

> Note: We can also use CountingSort to reduce the time complexity. [Reference](https://www.geeksforgeeks.org/counting-sort/ "Counting Sort in GeeksforGeeks").



