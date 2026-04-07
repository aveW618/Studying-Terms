public class StudyingTerms {
	private String vocabTerm;
	private String vocabDefinition;
	
	public StudyingTerms(vt, vd) {
		vocabTerm = vt;
		vocabDefinition = vd;
	}
	
	public String getVocabTerm {
		return vocabTerm;
	}
	
	public String getVocabDefinition {
		return vocabDefition;
	}
	
	public static ArrayList <String> loadTerms(String termFile) throws IOException {
		Arraylist termList = new ArrayList <>();
		String termFile = "unit1terms-2.txt";
		
		File myFile = new File(termFile);
		Scanner scan = new Scanner(myFile);
		
		if (scan.hasNextLine()) {
			scan.nextLine();
		}

		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] terms = line.split("[");
			String[] definitions = line.split("]");
			for (
			
		}
	}
			
	
	
	
