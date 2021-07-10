public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> names = new LinkedList<String>();
        String mail = ".+@gmail\\.com$";
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                if(Pattern.matches(mail, emailID)){
                names.add(firstName);
                }
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        
        
        Collections.sort(names);
        
        for(String name : names){
            System.out.println(name);
        }

        bufferedReader.close();
    }
}
