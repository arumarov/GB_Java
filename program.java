// import java.util.ArrayList;
// import java.util.List;

// class program {
//   List<Integer> path = new ArrayList<>();
//   List<List<Integer>> ans = new ArrayList<>();
  
//   public List<List<Integer>> combine(int n, int k) {
//       comb(n, k, 0, 1);
//       return ans;
//   }
  
//   void comb(int n, int k, int index, int number) {
//       if (index == k) {
//           ans.add(new ArrayList<>(path));
//           return;
//       }
      
//       if (number > n) {
//           return;
//       }
      
//       for (int i = number; i <= n; i++) {
//           patn.add(i);
//           comb(n, k, index + 1, i + 1);
//           path.remove(path.size() - 1);
//       }
//   }
// }