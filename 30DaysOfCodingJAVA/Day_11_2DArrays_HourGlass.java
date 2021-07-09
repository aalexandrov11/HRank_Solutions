public class Solution {
    
    public static int hourGlassSum(List<List<Integer>> arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 2; i++){
            for(int j = 0; j < arr.size() - 2; j++){
                sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if(sum > maxSum){
                maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println(hourGlassSum(arr));

        bufferedReader.close();
    }
}
