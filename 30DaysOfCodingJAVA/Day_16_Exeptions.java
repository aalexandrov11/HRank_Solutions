public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        
        try{
            System.out.println(Integer.parseInt(S));
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
        //finally{}
        bufferedReader.close();
    }
}
