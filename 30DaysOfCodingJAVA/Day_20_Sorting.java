public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        
        int numSwaps = 0;
        for(int i = 0; i < n; i++){
            int currentSwaps = 0;
            for(int j = 0; j < n - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    currentSwaps++;
                }
            }
            numSwaps += currentSwaps;
            if(currentSwaps == 0){
                break;
            }
        }
        
        System.out.printf("Array is sorted in %d swaps.\n", numSwaps);
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));

        bufferedReader.close();
    }
}
