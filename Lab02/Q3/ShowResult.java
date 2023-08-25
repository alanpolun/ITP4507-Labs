public class ShowResult {
    public static void printResult(Student s) {
          System.out.println("Student Name: "+s.getStudentName());
          System.out.println("Student ID: "+s.getStudentID());

          if (s.getStudentType() == Student.ThreeYearsHD) {
                System.out.println("Course Code: "+s.getCode());
                System.out.println("Course Name: "+s.getName());
                System.out.println("Student's Average Mark: "+s.getAverageMark());
          } else if (s.getStudentType() == Student.TwoYearsHD) {
                System.out.println("Programme Code: "+s.getCode());
                System.out.println("Programme Name: "+s.getName());
                System.out.println("Student's GCPA: "+s.getCgpa());
          }
    }
}
