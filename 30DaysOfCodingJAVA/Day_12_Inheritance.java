class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        double avrScore = 0;
        for(int i = 0; i < testScores.length; i++){
            avrScore += testScores[i];
        }
        avrScore /= testScores.length;
        if(avrScore < 40){
            return 'T';
        }else if(avrScore >= 40 && avrScore < 55){
            return 'D';
        }else if(avrScore >= 55 && avrScore < 70){
            return 'P';
        }else if(avrScore >= 70 && avrScore < 80){
            return 'A';
        }else if(avrScore >= 80 && avrScore < 90){
            return 'E';
        }else{
            return 'O';
        }
    }
    
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
