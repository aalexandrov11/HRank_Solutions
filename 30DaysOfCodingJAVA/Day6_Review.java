public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < n; i++){
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            String temp = scan.nextLine();
            for(int j = 0; j < temp.length(); j++){
                if(j % 2 == 0){
                    even.append(temp.charAt(j));
                } else{
                    odd.append(temp.charAt(j));
                }
            }
            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}

//String temp = scan.nextLine();
//            for(int j = 0; j < temp.length(); j++){
//                if(j % 2 == 0){
//                    even += temp.substring(j, j + 1);
//                } else{
//                    odd += temp.substring(j, j + 1);
//                }
//            }

// char[] temp = scan.nextLine().toCharArray();
//            for(int j = 0; j < temp.length; j++){
//                if(j % 2 == 0){
//                    even += temp[j];
//                } else{
//                    odd += temp[j];
//                }
//            }
