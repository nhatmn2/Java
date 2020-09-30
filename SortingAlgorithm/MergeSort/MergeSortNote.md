# Merge Sort Note:
* Divide and conquer algorithm
* Recursive algorithm
* Two phases: Splitting and Merging
* Splitting phase leads to faster sorting during the Merging phase
* Splitting is logical. We don't create new arrays.

-----------------------------------------------------------------------------------------
# Splitting phase:
* Start with an unsorted array
* Divide the array into two arrays, which are unsorted 
* The first array is the left array, and the second array is the right array
* Split the left and right arrays into two arrays each
* Keep splitting until all the arrays have only one element each - these arrays are sorted.

-----------------------------------------------------------------------------------------
# Merging phase:
* Merge every left/right pair of sibling arrays into a sorted array
* After the first merge, we'll have a bunch of 2-element sorted arrays
* Then merge those sorted arrays(left/right siblings) to end up with a bunch of 4-element sorted arrays
* Repeat until you have a single sorted array
* Not in place. Use temporary arrays.

-----------------------------------------------------------------------------------------
# Merging process:
* We merge sibling left and right arrays
* We create a temporary array large enough to hold all the elements in the arrays we're merging 
* We set i to the first index of the left array, and j to the first index of the right array
* We complete left[i] to right[j]. If right is smaller, we copy it to the temp array and increment j by 1.
* We repeat this process until all elements in the two arrays have been processed
* At this point, the temporary array contains the merged values in sorted order
* We then copy this temporary array back to the original input array, at the correct positions.
* If the left array is at positions x to y, and the right array is at position y+1 to z, then after the copy, positions x to z will be sorted in the original array.

--------------------------------------------------------------------------------------------
# Merge Sort Note 2:
* Not an in-place algorithm
* O(nlogn) - base 2. We're repeatedly dividing the array in half during the splitting phase 
* Stable algorithm