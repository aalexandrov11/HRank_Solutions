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
        for(int i = 0; i < elements.Length - 1; i++){
            for(int j = 1; j < elements.Length; j++){
                temp = Math.Abs(elements[i] - elements[j]);
                if(temp > this.maximumDifference){
                    this.maximumDifference = temp;
                }
            }
        }
    }
} // End of Difference Class

class Solution {
    static void Main(string[] args) {
        Convert.ToInt32(Console.ReadLine());
        
        int[] a = Console.ReadLine().Split(' ').Select(x=>Convert.ToInt32(x)).ToArray();
        
        Difference d = new Difference(a);
        
        d.computeDifference();
        
        Console.Write(d.maximumDifference);
    }
}
