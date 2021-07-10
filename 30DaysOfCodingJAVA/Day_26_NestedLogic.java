public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] returned = new int[3];
        int[] due = new int[3];
        returned = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                    
        due = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
                    
        if(returned[2] < due[2]){
            System.out.println("0");
        }else if(returned[2] == due[2]){
            if(returned[0] <= due[0] && returned[1] <= due[1]){
                System.out.println("0");
            }else if(returned[0] > due[0] && returned[1] == due[1]){
                System.out.println(15 * (returned[0] - due[0]));
            }else{
                System.out.println(500 * (returned[1] - due[1]));
            }
        }else{
            System.out.println("10000");
        }
        
        scan.close();
    }
}
