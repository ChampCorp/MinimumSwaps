# MinimumSwaps
Minimum Swaps2 of Hacker Rank

You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

For example, given the array arr=[7,1,3,2,4,5,6] we perform the following steps:

1) take a counter and initialize it to 0;
2) Iterate the array from i=0 to ArrayLength-1
    
    if array[0] != i+1
    
    then firstly you need to find out the position of i+1 in the array
    
    e.g. here arr[0]!= 0+1 i.e. 1
    so firstly you need to find out the position of 1 in the given array 
    
    once, you find the position of i+1 then perform swap operation between the position i and pos
    and increment the counter
    
  3) finally, return the counter.
