class Solution
{
    public static string convertToBinary(int n){
        int ostatuk = 0;
        string temp = "";
        while(n > 0){
            ostatuk = n % 2;
            n /= 2;
            temp += Convert.ToString(ostatuk);
        }
        
        char[] result = new char[temp.Length];
        for(int i = 0, j = temp.Length - 1; i < temp.Length; i++, j--){
            result[i] = temp[j];
        }
        
        return new string(result);
    }
    
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());
        string binaryNumber = convertToBinary(n);
        int result = 0;
        int temp = 0;
        
        for(int i = 0; i < binaryNumber.Length; i++){
            if(binaryNumber[i] == '1'){
                temp++;
                if(temp > result){
                    result = temp;
                }
            }else{
                temp = 0;
            }
        }
        
        Console.WriteLine(result);
    }
}
