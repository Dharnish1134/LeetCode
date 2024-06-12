# LeetCode
Daily challenges - June 12/2024

## 75.SortColours(Variation of Dutch National Flag Problem)
**Desription:** Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.You must solve this problem without using the library's sort function.

**Approach:** Given only "0,1,2" will exist in the array sorting will be such that there is always "0" on the left end and "2" on the right end. So we are using two pointers to ensure 0's end up on the left and 2's end up on the right which will automatically leave 1's in the middle giving us a sorted array.This approach has a time complexity of O(n) and a average runtime of 0ms.
 
>**Note:**We can also use Bubble sort which had a time complexity O(n^2^) and average runtime of 4ms.


