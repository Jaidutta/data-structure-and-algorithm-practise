import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortedSquares {
  /* 
    977. Squares of a Sorted Array
    https://leetcode.com/problems/squares-of-a-sorted-array/description/
    
  */
    public int[] sortedSquares(int[] nums) {
       List<Integer> pos = new ArrayList<>();
       List<Integer> neg = new ArrayList<>();
       
       for(int num: nums) {
        if(num >= 0) {
            pos.add(num);
        }
        else {
            neg.add(num);
        }
       }
       // all negative elements
       if(pos.size() == 0) {
        for(int i = 0; i < neg.size(); i++) {
             neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);
        return neg.stream().mapToInt(Integer:: intValue).toArray();
       }

       // all positive elements
       if(neg.size() == 0) {
        for(int i = 0; i < pos.size(); i++) {
             pos.set(i, pos.get(i) * pos.get(i));
        }
        
        return pos.stream().mapToInt(Integer:: intValue).toArray();
       }

       // mix of both positive and negative values
       int i = 0, j = 0, idx = 0;
       int n1 = neg.size();
       int n2 = pos.size();
       int[] res = new int [n1 + n2];

       // for all negative numbers, square and reverse
       for(i = 0; i < n1; i++) {
         neg.set(i, neg.get(i) *  neg.get(i));
       }
       Collections.reverse(neg);
       
       // square the positive numbers
       for(i = 0; i < n2; i++) {
        pos.set(i, pos.get(i) * pos.get(i));
       }
       i = 0;
       j = 0;

       // as long as one both of them is not exhausted
       while(i < n1 && j < n2) {
        if(neg.get(i) <= pos.get(j)) {
            res[idx++] = neg.get(i++);
        }
        else {
            res[idx++] = pos.get(j++);
        }
       }

       // whichever is remaining, add it to the array, in this case the positive number
       while(i < n1) {
        res[idx++] = neg.get(i++);
       }
       
      // whichever is remaining, add it to the array
       while(j < n2) {
        res[idx++] = pos.get(j++);
       }

       return res;
    }
}