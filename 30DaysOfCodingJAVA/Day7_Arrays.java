public class Solution {
    public static void reverse(int n, List<Integer> arr){
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr.get(i) + " ");
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        reverse(n, arr);
        
        bufferedReader.close();
    }
}
