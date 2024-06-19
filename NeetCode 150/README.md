# NeetCode 150
RoadMap - Arrays and Hashing June 19,2024.

## 1.Contains Duplicate:(ContainsDuplicate.java)
**Description:** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Approach:** 

1.Using HashSet:

There are two Approaches to solve the problem. As we know that we have to detect duplicates the first method is to use a HashSet as it does not allow duplicates. We create a HashSet and create a loop to traverse through the array and at each iteration check if the element is in the Set,if so then return true. If not then we can return false.

2.Using simple comparison:

The second approach is to traverse through the array and check for two conditions. First if the element and its previous elements are equal then return true,else if the element less than its previous elements then check if the elements previous to these elements are equal to the current element.If so then return true,but if not then swap the elements which sorts the array as it checks for duplicates. In the worst case it swaps all the elements leading to a time complexity of O(n<sup>2</sup>) ,we can use Arrays.sort() instead but still the methos sorts the entire array seperately. But this swaps only the necessary elements while checking for duplicates so this is more efficient than using sort() method.

## 2.ValidAnagram:(ValidAnagram.java)
**Description:** Given two strings s and t, return true if t is an anagram of s, and false otherwise.An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Approach:**
We are given two strings s and t, to check if they are anagram create a integer array of size 26. create two loops that iterates through the characters in each string. At each iteration find the difference of the character and { a }. This difference when used as a index of the array will implicitly convert to the integer equivalent which will be in the range of (0-25). In the first loop increment at each index and in the second loop decrement at each index. Now in a third loop check if any value in the array of size 26 is not equal to zero if so then it is not a anagram and return false.else return true.