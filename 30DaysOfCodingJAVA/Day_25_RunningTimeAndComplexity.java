public class Solution {
    
    static void isPrime(int n){
        boolean flag = true;
        if(n == 1){
            flag = false;
        }else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    flag = false;
                }
            }
        }
        
        if(flag == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(scan.nextLine());
            isPrime(n);
        }
        scan.close();
    }
}
