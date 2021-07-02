class Solution {
    static void isPrime(int n){
        bool flag = true;
        if(n == 1){
            flag = false;
        }else{
            for(int i = 2; i <= Math.Sqrt(n); i++){
                if(n % i == 0){
                    flag = false;
                }
            }
        }
        
        if(flag == true){
            Console.WriteLine("Prime");
        }else{
            Console.WriteLine("Not prime");
        }
    }
    
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int t = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < t; i++){
            int n = Convert.ToInt32(Console.ReadLine());
            isPrime(n);
        }
    }
}
