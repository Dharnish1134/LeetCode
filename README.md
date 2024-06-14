# LeetCode
Daily challenges - June 12/2024

## 1.SortColours(Variation of Dutch National Flag Problem)
**Desription:** Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.You must solve this problem without using the library's sort function.

**Approach:** Given only "0,1,2" will exist in the array sorting will be such that there is always "0" on the left end and "2" on the right end. So we are using two pointers to ensure 0's end up on the left and 2's end up on the right which will automatically leave 1's in the middle giving us a sorted array.This approach has a time complexity of O(n) and a average runtime of 0ms.
 
>Note:We can also use Bubble sort which had a time complexity O(n<sup>2</sup>) and average runtime of 4ms.

## 2.Minimum Number of Moves to Seat Everyone(MinimumMoves.java)
**Description:** There are n seats and n students in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.You may perform the following move any number of times:
Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1).Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.

**Approach:** We can use a counting sort method to solve the problem efficiently. First find the maximum element from both the arrays.Create a difference array of the maximum size.Now to reduce space complexity we'll use this single array where we increment the difference array at each index that matches the value in the seats array and decrement the difference array at each indec that matched the value in the student array.Now we can use the difference array to find the minimum moves.Iterate through the difference array, use a unmatched variable (negative unmathced means a student has no seat and positive unmatched means seats are vacant) now add the value of the difference array to the unmatched. now add the absolute value of the unmatched to the moves variable. Return the moves variable which is the minimum cost.

To learn more about counting sort and how it works. [Reference](https://www.geeksforgeeks.org/counting-sort/ "Counting Sort in GeeksforGeeks").

> Note: We can also use sorting(Arrays.sort) and find the difference between each index value of the arrays to find the minimum moves.

## 3.Minimum Increment to make arrays unique:(UniqueArray.java)
**Description:** You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.Return the minimum number of moves to make every value in nums unique.

**Approach:** Couting can be used to make the array unique,we'll use a frequency array to calculate the frequency of each element in the array and using this array we'll calculate the minimum moves to remove duplicates from the frequency array. Find the maximum element in the array and find create a frequency array of size nums array length + max.Now increment the frequency at each index from the value of the nums array.Traverse through the frequency array and if the value is greater than 1 calculate duplicates by subtracting 1 from the current value of frequency array and add it to the next element of the freqency array and add the duplicates to the number of moves. return the minimum number of moves.

> Note: We can also use Sorting technique but its not efficient and has a large time complexity.





