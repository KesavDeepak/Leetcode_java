import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        // First row
        res.add(new ArrayList<>(Arrays.asList(1)));
        
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> prev = res.get(res.size() - 1);
            
            // Add 0 at beginning and end
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(prev);
            temp.add(0);
            
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j < temp.size() - 1; j++) {
                row.add(temp.get(j) + temp.get(j + 1));
            }
            
            res.add(row);
        }
        
        return res;
    }
}