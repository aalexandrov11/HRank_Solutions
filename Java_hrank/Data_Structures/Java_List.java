public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        
        int q = scan.nextInt();
        for(int i = 0; i < q; i++){
            String s = scan.next();
            if(s.equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt());
            }else if(s.equals("Delete")){
                list.remove(scan.nextInt());
            }
        }
        scan.close();
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
