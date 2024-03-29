class Solution
{
    public static int hourGlassSum(List<List<int>> arr){
        int sum = 0;
        int maxSum = int.MinValue;
        //List<int> sums = new List<int>();
        
        for(int i = 0; i < arr.Count - 2; i++){
            //sum = arr[i][i] + arr[i][i+1] + arr[i][i+2] + arr[i+1][i+1] + arr[i+2][i] + arr[i+2][i+1] + arr[i+2][i+2];
            for(int j = 0; j < arr[i].Count - 2; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                //sums.Add(sum);
                if(sum > maxSum){
                maxSum = sum;
            }
            }
        }
        
        // for(int i = 0; i < sums.Count; i++){
        //     if(sums[i] > maxSum){
        //         maxSum = sums[i];
        //     }
        // }
        return maxSum;
    }
    
    public static void Main(string[] args)
    {

        List<List<int>> arr = new List<List<int>>();

        for (int i = 0; i < 6; i++)
        {
            arr.Add(Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList());
        }
        
        Console.WriteLine(hourGlassSum(arr));
    }
}
