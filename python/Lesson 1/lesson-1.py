## Collection Module
## Collections Module
from collections import deque, Counter, defaultdict, OrderedDict, namedtuple

# Deque (append, appendleft, pop, popleft, extend, extendleft, rotate, len)

  # Context: Short for "double-ended queue." It's much faster than a standard list for adding or removing items from the front.

# Counter (c[2], most_common, elements, subtract, +, -, &, |)

  # Context: Used for counting hashable objects. It's essentially a dictionary where the keys are the elements and the values are their counts.

# Defaultdict: Never raises KeyError, creates default value.

  # Context: Perfect for grouping items or counting without checking if a key exists first.

# OrderedDict: in, move_to_end, popitem

  # Context: Remembers the order in which items were inserted (though standard Python dicts do this now too since 3.7+).

# Namedtuple: Tuples with named fields (immutable).

  # Context: Great for making your code more readable by accessing data using   names (like point.x) instead of indexes (like point[0]).

import sys
sys.stdin = open('input.txt', 'r')
sys.stdout = open('output.txt', 'w')

########### deque #########
dq = deque([2,3, 1]) 
dq.append(5)  # deque([2, 3, 1, 5])
print(dq)

dq.appendleft(7)
print(dq) # deque([7, 2, 3, 1, 5])

print(dq.pop()) # will remove and then return the last element  --> 5

print(dq.popleft())   # will remove element from the left and then return the last element  --> 7

dq.extend([10, 15]) 
print(dq) # deque([2, 3, 1, 10, 15])
dq.extend([16, "Krsna"]) 
print(dq) # deque([2, 3, 1, 10, 15, 16, 'Krsna'])
dq.extendleft([89, "Pami"])
print(dq) #  # deque(['Pami', 89, 2, 3, 1, 10, 15, 16, 'Krsna'])

###### rotate ######
dq.rotate(1)
print(dq) # deque(['Krsna', 'Pami', 89, 2, 3, 1, 10, 15, 16])


################## Counter #########################
arr6 = Counter([1, 2, 2, 3, 2, 3, 3, 4])
print(arr6[3]) # appears 3 times
print(arr6.most_common(1)) ## it gives the top common elements. In this cas top 1 common element -> [(2, 3)]

print(list(arr6.elements())) # it follows the insertion order  [1, 2, 2, 2, 3, 3, 3, 4] 

arr6.update([7, 7])
print(list(arr6.elements())) # [1, 2, 2, 2, 3, 3, 3, 4, 7, 7]

arr6.subtract([3]) # it takes off one 3 from the  list
print(list(arr6.elements())) # [1, 2, 2, 2, 3, 3, 4, 7, 7]

# c1: 1 appears 1x, 2 appears 3x, 3 appears 3x, 4 appears 1x
c1 = Counter([1, 3, 2, 2, 2, 3, 3, 4]) 

# c2: 3 appears 2x, 1 appears 1x, 4 appears 1x, 5 appears 1x
c2 = Counter([3, 3, 1, 4, 5])

# c3 = c1 - c2 
# Logic: 
# 1s: 1 - 1 = 0 (Removed)
# 2s: 3 - 0 = 3 (Stays)
# 3s: 3 - 2 = 1 (Stays)
# 4s: 1 - 1 = 0 (Removed)
# 5s: 0 - 1 = -1 (Removed because Counter subtraction only keeps positive results)
c3 = c1 - c2

print(list(c3.elements()))
# Output: [3, 2, 2, 2] (or similar order depending on insertion)


# c2: 3(2x), 1(1x), 4(1x), 5(1x)
#c2 = Counter([3, 3, 1, 4, 5])

# c1: 1(1x), 3(3x), 2(3x), 4(1x)
#c1 = Counter([1, 3, 2, 2, 2, 3, 3, 4]) 

c4 = c2 - c1

# Calculation Logic:
# 1s: 1 - 1 = 0  -> (Removed)
# 2s: 0 - 3 = -3 -> (Removed)
# 3s: 2 - 3 = -1 -> (Removed)
# 4s: 1 - 1 = 0  -> (Removed)
# 5s: 1 - 0 = 1  -> (Kept!)

print(list(c4.elements())) # only the positive ones are kept
# Output: [5]

c5 = c1 + c2
print(list(c5.elements())) # [1, 1, 3, 3, 3, 3, 3, 2, 2, 2, 4, 4, 5] --> insertion of the 1st one will be followed

################# & ################################ 
# It takes the common element and the minimum
c6 = c1 & c2
print(list(c6.elements())) # [1, 3, 3, 4] 

c7 = c1 | c2 
print(list(c7.elements())) # [1, 3, 3, 3, 2, 2, 2, 4, 5] --> takes all and the max element for the common element

from collections import defaultdict


############################### default dictionary ########################
# The 'int' inside means if a key doesn't exist, it defaults to 0
dd = defaultdict(int)

dd[1] = "raj"
dd["striver"] = "raj"
dd['u'] = 99
dd["list"] = [1, 2, 4]

print(dd["list"])

# default dictionary never raise an error if the key is not there. Instead
# it returns the default value

dd["list"].append(10)
print(dd["list"]) # [1, 2, 4, 10]


######################## Ordered Dictionary ########################
# Initializing an OrderedDict with a list of tuples (key, value)
## it maintains the order and raises and error if not in the dict
od = OrderedDict([(1, "raj"), (3, "striver"), (2, "tuf"), (7, "msd")])

print(od)

if 1 in od:
  print(od[1])
else:
  print("Not in the dict")

# move to end
od.move_to_end(3)
print(od)  # OrderedDict({1: 'raj', 2: 'tuf', 7: 'msd', 3: 'striver'})

# move to the front --> last = False forces the element to be at the front
od.move_to_end(3, last= False)
print(od)  # OrderedDict({3: 'striver', 1: 'raj', 2: 'tuf', 7: 'msd'})



# popitem delete the last itme
od.popitem() 
print(od) # OrderedDict({3: 'striver', 1: 'raj', 2: 'tuf'})

od.pop(1) 
print(od) # OrderedDict({3: 'striver', 2: 'tuf'})

########################## TUPLE #################################
# tuples are ordered and the order cannot be changed

val1 = (1, 4, 5)
val2 = (4, 1, 5)
# print(val2[1] = 5 ) --> value of an eleement is immuatablee
print(val1 == val2) # False
val3 = (3, (6, 7))
print(val3[1][1]) # -> 7

a, (b, c) = val3
print(a, b, c)  # 3, 6, 7

# Named tuple
Point = namedtuple('Point', ['first', 'second'])
val1 = Point(7,9)
print(val1)
# val1.first = 10 tuples are not mutable so this is not allowed. 
# To mutate we will neeed to use list
print(val1)

Point = namedtuple('Point', ['first', 'second'])

NestedPoint = namedtuple('NestedPoint', ['first', 'second'])

val5 = Point(6, 9)
val6 = NestedPoint(2, val5)

print(val6.second.second)

###################### MUTABLE multiple values  like list and class ############

val8 = [ 2, [3, 7]]
val8[1][1] = 10
print(val8[1][1])

#### We can use classes as below
# Defining the blueprint
class Pair:
    def __init__(self, first, second):
        self.first = first
        self.second = second

# Creating an instance (object) of the class
pair1 = Pair(2, 9)

# Accessing the attributes of the object
print(pair1.first, pair1.second)
pair1.first = 10
pair1.second = 20

print(pair1.first, pair1.second)
