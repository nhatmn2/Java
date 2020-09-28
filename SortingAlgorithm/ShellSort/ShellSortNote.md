# Shell Sort:
* Variation of Insertion Sort  
* Insertion sort chooses which element to insert using a gap of 1  
* Shell sort starts out using a larger gap value  
* As the algorithms runs, the gap is reduced  
* Goal is to reduce the amount of shifting required  
* The last gap value is always 1  
* A gap value of 1 is equivalent to insertion sort  
* So, the algorithm does some preliminary work (using gap values greater than 1), and then becomes insertion sort   
* By the time we get to the insertion sort, the array has been partially sorted, so there's less shifting required.

----------------------------------------------------------------------------------------------------------------------
# Knuth Sequence:
![Knuth Sequence](https://github.com/nhatmn2/Java/blob/master/SortingAlgorithm/ShellSort/Knuth%20Sequence.JPG)  
* Gap is calculate using (3<sup>k</sup> - 1)/2  
* we set k based on the length of the array  
* We want the gap to be as close as possible to the length of the array we want to sort, without being greater than the length.  
* Example:  
| k | Gap(interval) |
|---|---------------|
| 1 | 1             |
| 2 | 4             |
| 3 | 13            |
| 4 | 40            |
| 5 | 121           |