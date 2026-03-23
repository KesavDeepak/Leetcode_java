class Solution {

    List<List<Integer>> res = new ArrayList<>();
    int[] candidates;
    int target;

    void dfs(int i, List<Integer> num, int total) {
        if (total == target) {
            res.add(new ArrayList<>(num));
            return;
        }

        if (i >= candidates.length || total > target) {
            return;
        }
        num.add(candidates[i]);
        dfs(i, num, total + candidates[i]);
        num.remove(num.size() - 1);
        dfs(i + 1, num, total);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;

        dfs(0, new ArrayList<>(), 0);
        return res;
    }
}