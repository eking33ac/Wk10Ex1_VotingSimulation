import java.util.Scanner;  // Import the Scanner class
import java.util.HashMap; // Import the HashMap class (like a dictionary)

class Main {
    // HashMap (dictionary) to count votes: candidatename, votecount
    public static HashMap<String, Integer> voteCount = new HashMap<String, Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // declarations
        String aVote = ""; // declare string variable to hold the user's vote
        int userSelection = 0; // declare variable to hold user's selection

        // allow user to choose candidate names of three candidates. store candidate in a HashMap(dictionary)
        for (int i=1 ; i<=3 ; i++) {
            // prompt user to enter the name of the candidate
            System.out.println("Enter the name of candidate " + i + ": ");
            // recieve user input and store it as an int in the numOfCandidate variable
            String candidateName = scanner.nextLine();

            // put the candidate name in the hashmap and initialize their votes to 0
            voteCount.put(candidateName, 0);
        }

        // while loop to make the whole thing repeat
        while(true) {
            

            
            // for loop title
            System.out.println("Candidates");
            
            // counter for the loop
            int counter = 0;
            // foreach loop to display candidate names and matching numbers(i) to vote based on
            for (String i : voteCount.keySet()) {
                // add 1 to the counter
                counter += 1;
                //String candidate = i;
                System.out.println(counter + ". " + i);
            }


            // provide options to the user
            System.out.println("\nOptions:");
            // tell user to press 1 to add a vote
            System.out.println("1. Add vote");
            // tell user to press 2 to 
            System.out.println("2. Display Results");
            // tell user to press 3 to 
            System.out.println("3. Reset Votes");

            // tell user to enter the number to choose their option
            System.out.println("Enter the number coorelating to your option:");
            // collect user input
            userSelection = scanner.nextInt();


                // switch case to add vote to the candidate
                switch (userSelection) {
                    // run when aVote = 1
                    case 1:
                        // prompt user to type the name of the candidate they wish to vote for
                        System.out.println("Input the name of the candidate you are voting for");

                        // consume the newline character left by next int
                        aVote = scanner.nextLine();

                        // recieve user input and put it in the aVote variable
                        aVote = scanner.nextLine();

                        // add a vote to candidate
                        castVote(aVote);
                        // jump out of switch case 
                        break;
                    // run when aVote = 2
                    case 2:
                        // display the vote results
                        displayResults();
                        // jump out of switch case 
                        break;
                    // run when aVote = 3
                    case 3:
                        // reset the votes in case they need to start over
                        resetVotes();
                        // jump out of switch case 
                        break;
                    default:
                        // inform user there was an error and prompt another attempt
                        System.out.println("Something went wrong. Try again.");
                }
            }
        }
    

    
    
    // method to cast a vote
    public static void castVote(String candidateName) {
        // Check if candidate name is a name in the keys of the HashMap
        if (voteCount.containsKey(candidateName)) {
            // increment the votes for that candidate by one
            int currentCount = voteCount.get(candidateName);
            // add 1 to the vote count
            voteCount.put(candidateName, currentCount + 1);
            // output the successful vote input
            System.out.println("Vote added for " + candidateName + ".");
        }
        // if the name is not an option to vote for
        else {
            // tell user the name is not present in the list.
            System.out.println("The name " + " is not among the voting options.\n");
        }
    }

    // method to display results
    public static void displayResults() {
        // for each key in votecount
        for (String i : voteCount.keySet()) {
            // output the key and the vote count
            System.out.println(i + ": " + voteCount.get(i));
        }
    }

    public static void resetVotes() {
        // for each key in the dictionary
        for (String i : voteCount.keySet()) {
            // set the vote count value to 0
            voteCount.put(i, 0);
            // output the successful reset
            System.out.println("Votes set to " + voteCount.get(i) + " for " + i + ".");
        }
        

        // tell users votes were reset
        System.out.println("Votes successfully reset to 0.");
    }


    // method to reset votes
}