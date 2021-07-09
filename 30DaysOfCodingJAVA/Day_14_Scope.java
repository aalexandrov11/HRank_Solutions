class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference(){
        this.maximumDifference = 0;
        int temp = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = 1; j < elements.length; j++){
                temp = Math.abs(elements[i] - elements[j]);
                if(temp > this.maximumDifference){
                    this.maximumDifference = temp;
                }
            }
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
