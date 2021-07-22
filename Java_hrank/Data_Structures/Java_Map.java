class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> addrBook = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            addrBook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(addrBook.containsKey(s)){
                System.out.println(s + "=" + addrBook.get(s));
            }else{
                System.out.println("Not found");
            }
		}
	}
}
