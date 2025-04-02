import java.util.Scanner;  // Import the Scanner class
import java.util.HashMap; // Import the HashMap class (like a dictionary)

class Main {
    // HashMap (dictionary) to count votes: candidatename, votecount
    public static HashMap<String, Integer> voteCount = new HashMap<String, Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // declarations
        boolean EXIT = false;
        int numOfCandidate = 0;

        // do while loop to make the whole thing repeat
        do {
            // allow user to choose candidate names and number of candidates. store candidate in a HashMap(dictionary)

            // prompt input the number of candidates
            System.out.print("Enter the number of candidates in your election: ");
            // recieve user input and store it as an int in the numOfCandidate variable
            numOfCandidate = scanner.nextInt(); // Add verification???

            // for the number of candidates variable, have them enter a candidate name
            for (int i=1; i<=numOfCandidate; i++) {
                // prompt user to enter the name of the first candidate
                System.out.println("Enter the name of candidate " + i + ": ");
                // recieve user input and store it as an int in the numOfCandidate variable
                String candidateName = scanner.nextLine();

                // put the candidate name in the hashmap and initialize their votes to 0
                voteCount.put(candidateName, 0);
            }

            
            // for loop title
            System.out.println("Candidates");
            
            // counter for the loop
            int counter = 0;
            // foreach loop to display candidate names and matching numbers(i) to vote based on
            for (String i : voteCount.keySet()) {
                counter += 1;
                //String candidate = i;
                System.out.println(counter + ". " + i);
            }








        
            // tell user to input EXIT to exit
            System.out.println("");
            // if their input.toUpper == "EXIT"
                // set the exit variable to true
        }
        while (EXIT == false);
    }

    
    
    // method to cast a vote
    public static void castVote(String candidateName) {
        


        // prompt user to vote by entering a number which matches a candidate name

        // recieve input and put it in a variable



    }

    // method to display results
    public static void displayResults() {

    }

    public static void resetVotes() {
        
    }


    // method to reset votes
}