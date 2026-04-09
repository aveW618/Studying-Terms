//Avery Wang
//Computer Science A Quiz Program

import java.io.*;
import java.util.*; 

public class StudyingTerms {
	//declaraing private instance variables
	private String vocabTerm;
	private String correctDefinition;
	private int questionNumber;
	
	//writing a constructor to initialize the new objects
	public StudyingTerms(String vt, String cd, int qn) {
		this.vocabTerm = vt;
		this.correctDefinition = cd;
		this.questionNumber = qn;
	}
	
	//getters
	public String getVocabTerm() {
		return vocabTerm;
	}
	
	public String getCorrectDefinition() {
		return correctDefinition;
	}
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	
	
	//creating the loadQuiz method to import the text file and split the info based on delimiters
		//then printing out the quiz terms, getting input from the user, and outputting their correctness
	public static ArrayList <String> loadQuiz(String termFile) throws IOException {
		//creating a new ArrayList of Objects 
			//the objects will hold the question, the correct answer, three additional options, and the question number
		Arraylist <QuizTerm> termList = new ArrayList <QuizTerm>();
		
		//file.io code which allows the file to be scanned
		File myFile = new File(termFile);
		Scanner scan = new Scanner(myFile);
		
		//checks if the file has a next line
		if (scan.hasNextLine()) {
			scan.nextLine();
		}
		
		//start tracker to keep track of the question number
		int questionNum = 0;
		
		//loop for while the file has a next line/more info
		while (scan.hasNextLine()) {
			//stores the info of the line
			String line = scan.nextLine();
			
			//splits the test on its delimiters
			String[] terms = line.split("]");
			String[] terms = data[0];
			
			//I'm still confused about how to store the definition part of the text file
			//String[] definitions = data[1];
			
			//looping through the length of the array with the terms stored
			for (int i = 0; i < terms.length; i++) {
				
				//uses Math.random to get a random integer from 0 - the array length
				int index = (Math.random() * terms.length);
				
				//increments the question number which will later be outputted to the user
				questionNum++;
				
				//stores the current term as the word in the terms array at the position of index
				currentTerm = terms[index];
				
				//same as the step above but stores the current defition as the words in the defition array at the position of index
				currentDefition = definitions[index];
				
				//adds a term object to the termList ArrayList
				termList.add(new QuizTerm(questionNum, currentTerm, currentDefinition));
				
			}
			scan.close();
			
		}
	}
}
	

//main method
public static void main(String[] args) throws IOException {
	ArrayList<QuizTerm> termList = loadQuiz("unit1terms-2.txt");
	System.out.println("Please type the term correspond to the given definition: ");
	for (
	
			
	
	
	
