class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int[] returned = new int[3];
        int[] due = new int[3];
        returned = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp));
        due = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp));
        
        if(returned[2] < due[2]){
            Console.WriteLine("0");
        }else if(returned[2] == due[2]){
            if(returned[0]<= due[0] && returned[1] <= due[1]){
                Console.WriteLine("0");
            }else if(returned[0] > due[0] && returned[1] == due[1]){
                Console.WriteLine("{0}", 15 * (returned[0] - due[0]));
            }else{
                Console.WriteLine("{0}", 500 * (returned[1] - due[1]));
            }
        }else{
            Console.WriteLine("10000");
        }
        
    }
}
