class Solution
{
    public static void Main(string[] args)
    {
        int N = Convert.ToInt32(Console.ReadLine().Trim());
        List<string> names = new List<string>();
        string mail = @".+@gmail\.com$";//. - any single char, + matches the previous element 1 or more times, \. - to match a dot not a single char., $ end
        for (int NItr = 0; NItr < N; NItr++)
        {
            string[] firstMultipleInput = Console.ReadLine().TrimEnd().Split(' ');

            string firstName = firstMultipleInput[0];

            string emailID = firstMultipleInput[1];
            
            if(Regex.IsMatch(emailID, mail)){
                names.Add(firstName);
            }
        }
        
        names.Sort();
        
        foreach(var name in names){
            Console.WriteLine(name);
        }
    }
}
