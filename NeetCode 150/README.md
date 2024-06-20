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

## 3.Two Sum:(TwoSum.java)
**Description:** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.

**Approach:** To find the index of two numbers that can add up to target number, we can use a hashmap as a hashmap is easy way to retrive elements using a key value pair structure. Traverse through the array and for each element find the difference of the target and the number which will be the required number to satisfy the condition. Now check if this number is present in the HashMap if so return the value of that key and the index of the current number which is i from the loop. If not add the number as key and its index (i) as value to the HashMap.If the pair does not exit return a empty array.

## 4.Group Anagrams:(GroupAnagram.java)
**Description:** Given an array of strings strs, group the anagrams together. You can return the answer in any order.An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Approach:** We can use a HashMap to check for finding the group of anagrams. As we know that anagrams are words that has same characters in different orders. So no matter how the characters are shufffled if we sort the string we get the same string if they are anagram. We can use the sortedString as a key and add the strings that has the same sortedString in a arraylist as value.Now we can return these groups as a new ArrayList which will have the list of all the strings that are anagrams.

## 5.Top k frequent Elements:(Topk.java)
**Description:** Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

**Approach:** There a multiple approaches to solve the problem but using the min and max values of the array to minimise the number of iterations to be made significantly increases the performance. First find the minimum and maximum value of the array. Now we know the range of elements in the array, so instead of creating a frequency array of size max we can reduce it to (max-min+1). Now traverse the nums array and for each element we can find the equivalent number in the range by subtracting the num by minimum and in that index increment the value. Now in a bucket array use the frequency array as index and add the values with the corresponding index by simple add the i with minimum (i+minimum). Now we can traverse the bucket array in reverse order and find the top k frequent elements.
 