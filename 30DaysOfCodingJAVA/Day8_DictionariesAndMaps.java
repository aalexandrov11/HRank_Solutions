class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> addr = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            addr.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(addr.containsKey(s)){
                System.out.printf("%s=%d\n", s, addr.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
