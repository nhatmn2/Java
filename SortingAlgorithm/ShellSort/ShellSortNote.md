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
![Knuth Sequence](Java/SortingAlgorithm/ShellSort/Knuth Sequnce.JPG)