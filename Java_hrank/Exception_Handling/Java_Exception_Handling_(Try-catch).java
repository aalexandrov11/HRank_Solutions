public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a / b);
        }
        catch(ArithmeticException | InputMismatchException e){
            if(e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }else{
            System.out.println(e);
            }
        }
    }
}
