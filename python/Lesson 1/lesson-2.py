# Priority Queue (heapq)

# Bisect – Binary Search

# Itertools – Iteration tools

# Math modules

# Random modules

# List methods

# Dict methods

# Set methods

# String methods

# 2. Heapq – Priority QueueIn Python, the heapq module implements a Min-Heap by default. It gives us the minimum element straightaway. It does it in a super quick time O(1)


# Key Methods:heappush(heap, item): Adds an element while maintaining heap property.
# heappop(heap): Removes and returns the smallest element.heapify(list): Transforms a regular list into a heap in-place ($O(N)$ time).
# heappushpop(heap, item): Pushes an item, then pops the smallest.
# heapreplace(heap, item): Pops the smallest, then pushes a new item.
# heap[0]: Access the smallest element without removing it.
# nlargest(k, iterable) / nsmallest(k, iterable): Get the top $K$ elements.


# When to use? 
# Priority Queue implementations.
# Finding the K largest/smallest elements.
# Merging K sorted lists.
# Dijkstra's Algorithm (Shortest path).

import sys
sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')

import heapq

data = [10, 1, 5, 20, 3]
heapq.heapify(data) # Converts list to heap in-place
print(f"Min-Heap: {data}")

# Always pops the smallest value
smallest = heapq.heappop(data) 
print(f"Popped Smallest: {smallest}")

# Adding a new value
heapq.heappush(data, 2)
print(f"Heap after push: {data}")

# Example

# Initializing the empty list
val = []

# Pushing multiple values
heapq.heappush(val, 10)
heapq.heappush(val, 7)
heapq.heappush(val, 9)
heapq.heappush(val, 19)
heapq.heappush(val, 12)
heapq.heappush(val, 1)

print(val) #  [1, 10, 7, 19, 12, 9]
# The 1 will be at the front because it's the smallest.

# Popping the smallest element
heapq.heappop(val) 

print(val) # [7, 10, 9, 19, 12]

heapq.heappushpop(val, 9) # Push first, then Pop. 
print(val)  # [9, 10, 9, 19, 12]

heapq.heapreplace(val, 29) # Pop first, then Push.
print(val) # [9, 10, 29, 19, 12] 

###################### n largest & nsmallest ##################################
print(heapq.nlargest(3, [7,1,5, 3, 10]))

############################### heapify ########################################

# method 1
arr = [7, 8, 2, 1, -16, 6]
value = []
for items in arr:
  heapq.heappush(value, items)

print(value) # [-16, 1, 6, 8, 2, 7]

# method 2
heapq.heapify(arr)
print(arr) # [-16, 1, 2, 7, 8, 6]

# Maximum heap
arr1 = [6, 7, 8, 9 , 10]


####################### MAX HEAP #####################
arr = [6, 7, 8, 9, 10]
pq = []

# To create a Max-Heap, multiply items by -1 before pushing
for item in arr:
    heapq.heappush(pq, -1 * item)

# To get the actual maximum value back, multiply by -1 again
# pq[0] is the 'root' or top of the heap
print(-1 * pq[0])

#########################  BINARY SEARCH ###########################

import bisect
arr_bisect = [4, 5, 5, 6, 7, 7, 9, 10, 12, 12, 13]

# bisect_left  finds the leftmost place to 
# insert the value while keeping the list sorted.
print(bisect.bisect_left(arr_bisect, 5)) # 1

# bisect_right (or just bisect) finds the rightmost place to 
# insert the value while keeping the list sorted.
print(bisect.bisect_right(arr_bisect, 5)) # 3

# Output: 3