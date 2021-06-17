class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int n = Convert.ToInt32(Console.ReadLine());
        string odd;
        string even;
        
        for(int i = 0; i < n; i++){
            string word = Console.ReadLine();
            odd = null;
            even = null;
            for(int j = 0; j < word.Length; j++){
                if(j % 2 == 0){
                    even += word[j];
                }else{
                    odd += word[j];
                }
            }
            Console.WriteLine(even + " " + odd);
        }
    }
}
