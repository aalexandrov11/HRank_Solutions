class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int n = Convert.ToInt32(Console.ReadLine());
        // Dictionary<string, int> addrBook = new Dictionary<string, int>();
        Dictionary<string, string> addrBook = new Dictionary<string, string>();
        for(int i = 0; i < n; i++){
            // string temp = Console.ReadLine();
            // int space = temp.IndexOf(' ');
            // string key = temp.Substring(0, space);
            // int value = Convert.ToInt32(temp.Substring(space));
            // addrBook.Add(key, value);
            string[] line = Console.ReadLine().Split(' ');
            addrBook[line[0]] = line[1];
            
        }
        
        for(int i = 0; ; i++ ){
            string temp = Console.ReadLine();
            if(temp == null){
                break;
            }else if(addrBook.ContainsKey(temp)){
                Console.WriteLine("{0}={1}", temp, addrBook[temp]);
            }else{
                Console.WriteLine("Not found");
            }
        }
        
    }
}
