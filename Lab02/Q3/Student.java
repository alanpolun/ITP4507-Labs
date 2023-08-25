public class Student {
	public static final int ThreeYearsHD = 0;
	public static final int TwoYearsHD = 1;
	private int studentType;     //0 for 3 Years or 1 for 2 Years
	private String code;             // Course or Programme Code
	private String name;           // Course or Programme Name
	private int averageMark;    // Average Mark for 3 Years HD student
	private double cgpa;            // CGPA for 2 Years HD student
  	private String studentName;
  	private String studentID;

  	public Student(int studentType, String code, String name, int averageMark, 
		double cgpa, String studentName, String studentID) {
    		this.studentType = studentType;
    		this.code = code;
    		this.name = name;
    		this.averageMark = averageMark;
    		this.cgpa = cgpa;
    		this.studentName = studentName;
    		this.studentID = studentID;
  	}

  	public String getCode() { return code; }

  	public String getName() { return name; }

  	public int getAverageMark() { return averageMark; }

  	public double getCgpa() { return cgpa; }

  	public int getStudentType() { return studentType; }

  	public String getStudentName() { return studentName; }

  	public String getStudentID() { return studentID; }

	// other methods : implementation not shown
}
