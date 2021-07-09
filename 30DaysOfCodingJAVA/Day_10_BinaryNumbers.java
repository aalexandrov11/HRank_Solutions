public class Solution {
    public static String convertToBinary(int n){
        int remain = 0;
        StringBuilder temp = new StringBuilder();
        while(n > 0){
            remain = n % 2;
            n /= 2;
            temp.append(remain);
        }
        
        char[] result = new char[temp.length()];
        //System.out.println(result.toString);
        //System.out.println(temp.length());
        for(int i = 0, j = temp.length() - 1; i < temp.length(); i++, j--){
            result[i] = temp.charAt(j);
            
        }
        
        return new String(result);//String.valueOf(result); - sushto stava // ako se izpolzva result.toString() shte predade adresa, a ne stoinostta
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binaryNumber = convertToBinary(n);

        int result = 0;
        int temp = 0;
        for(int i = 0; i < binaryNumber.length(); i++){
            
            if(binaryNumber.charAt(i) == '1'){
                temp++;
                if(temp > result){
                    result = temp;
                }
            }else{
                temp = 0;
            }
        }
        
        System.out.println(result);
        
        bufferedReader.close();
    }
}
