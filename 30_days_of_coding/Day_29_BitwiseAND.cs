class Result
{

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K)
    {
        // List<int> integers = new List<int>();
        // integers.AddRange(Enumerable.Range(1, N));
        // int result = Int32.MinValue;
        // for(int i = 0; i < integers.Count - 1; i++){
        //     for(int j = i + 1; j < integers.Count; j++){
        //         int temp = integers[i]&integers[j];
        //         if(result <= temp && temp < K){
        //             result = temp;
        //         }
        //     }
        // }
        
        int result = Int32.MinValue;
        for(int i = 1; i < N; i++){
            for(int j = i + 1; j <= N; j++){
                int temp = i & j;
                if(result <= temp && temp < K){
                    result = temp;
                }
            }
        }
        
        return result;
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int t = Convert.ToInt32(Console.ReadLine().Trim());

        for (int tItr = 0; tItr < t; tItr++)
        {
            string[] firstMultipleInput = Console.ReadLine().TrimEnd().Split(' ');

            int count = Convert.ToInt32(firstMultipleInput[0]);

            int lim = Convert.ToInt32(firstMultipleInput[1]);

            int res = Result.bitwiseAnd(count, lim);

            textWriter.WriteLine(res);
        }

        textWriter.Flush();
        textWriter.Close();
    }
}
