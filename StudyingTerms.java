//Avery Wang
//Computer Science A Quiz Program

import java.io.*;
import java.util.*; 

public class StudyingTerms {
	//private instance variables
	private String vocabTerm;
	private String correctDefinition;
	
	//writing a constructor to initialize the new objects
	public StudyingTerms(String vt, String cd) {
		this.vocabTerm = vt;
		this.correctDefinition = cd;
	}
	
	//getters
	public String getVocabTerm() {
		return vocabTerm;
	}
	
	public String getCorrectDefinition() {
		return correctDefinition;
	}
	
	
	//creating the loadQuiz method to import the text file and split the info based on delimiters
		//then printing out the quiz terms, getting input from the user, and outputting their correctness
	public static ArrayList <StudyingTerms> loadQuiz(String termFile) throws IOException {
		//creating a new ArrayList of Objects 
			//the objects will hold the question, the correct answer, three additional options, and the question number
		Arraylist <StudyingTerms> termList = new ArrayList <StudyingTerms>();
		
		//file.io code which allows the file to be scanned
		File myFile = new File(termFile);
		Scanner scan = new Scanner(myFile);
		
		//checks if the file has a next line
		if (scan.hasNextLine()) {
			scan.nextLine();
		}
		
		//start tracker to keep track of the question number
		int questionNum = 1;
		
		//loop for while the file has a next line/more info
		while (scan.hasNextLine()) {
			//stores the info of the line
			String line = scan.nextLine();
			
			//splits the test on its delimiters
			String[] data = line.split("]");
			String[] terms = data[0];
			String[] definitions = data[1];
			
			termList.add(new StudyingTerms(terms, definitions);
		}
		scan.close();
		return termList;
			
		//looping through the length of the array with the terms stored
		for (int i = 0; i < termList.size(); i++) {
				
			//uses Math.random to get a random integer from 0 - the array length
			int index = (int)(Math.random() * termList.size());
				
			//stores the current term as the word in the terms array at the position of index
			String currentTerm = terms[index];
			//same as the step above but stores the current defition as the words in the defition array at the position of index
			String currentDefition = definitions[index];
				
			//outputs the randomized defition and asks the user for their input
			System.out.println(currentDefition);
			System.out.println("Your answer: ");
			//stores user input
			String userInput = input.nextLine();
			
			if (userInput.equalsIgnoreCase(currentTerm)) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("Incorrect. The correct answer was: " + currentTerm + ".");
			}
		}
	}
}
	

//main method
public static void main(String[] args) throws IOException {
	ArrayList<StudyingTerms> termList = loadQuiz("unit1terms-2.txt");
	//reads input text from user
	Scanner input = new Scanner(System.in);
	
	//counter to track number of correct questions
	int correct = 0;
	
	System.out.println("Please type the term corresponding with the given definition: ");

	for (int i = 0; i < termList.size(); i++) {
			System.out.println("Question #" + (i + 1) + " " + 
	
			
	
	
	
