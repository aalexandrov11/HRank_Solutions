class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();

        // Write your code here
        int numSwaps = 0;
        for(int i = 0; i < n; i++){
            int currentSwaps = 0;
            for(int j = 0; j < n - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    currentSwaps++;
                }
            }
            numSwaps += currentSwaps;
            if(currentSwaps == 0){
                break;
            }
        }
        Console.WriteLine("Array is sorted in {0} swaps.", numSwaps);
        Console.WriteLine("First Element: " + a[0]);
        Console.WriteLine("Last Element: " + a[n - 1]);
    }
}
