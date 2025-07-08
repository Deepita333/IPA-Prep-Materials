import java.util.*;

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

  
    public Course(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }


    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getCourseAdmin() { return courseAdmin; }
    public int getQuiz() { return quiz; }
    public int getHandson() { return handson; }

    public void setCourseId(int courseId) { this.courseId = courseId; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setCourseAdmin(String courseAdmin) { this.courseAdmin = courseAdmin; }
    public void setQuiz(int quiz) { this.quiz = quiz; }
    public void setHandson(int handson) { this.handson = handson; }
}

public class courseProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Course[] arr = new Course[n];

     
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String admin = sc.nextLine();
            int quiz = sc.nextInt(); sc.nextLine();
            int handson = sc.nextInt(); sc.nextLine();
            arr[i] = new Course(id, name, admin, quiz, handson);
        }

        String adminToSearch = sc.nextLine();
        int handsonLimit = sc.nextInt();

  
        int avgQuiz = findAvgOfQuizByAdmin(arr, adminToSearch);
        if (avgQuiz != 0) {
            System.out.println(avgQuiz);
        } else {
            System.out.println("No Course found");
        }

      
        Course[] sortedCourses = sortCourseByHandsOn(arr, handsonLimit);
        if (sortedCourses != null && sortedCourses.length > 0) {
            for (Course c : sortedCourses) {
                System.out.println(c.getCourseName());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }
    }

    public static int findAvgOfQuizByAdmin(Course[] xyz, String s) {
        int total = 0, count = 0;
        for (Course c : xyz) {
            if (c.getCourseAdmin().equalsIgnoreCase(s)) {
                total += c.getQuiz();
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }

    public static Course[] sortCourseByHandsOn(Course[] xyz, int v) {
        List<Course> result = new ArrayList<>();
        for (Course c : xyz) {
            if (c.getHandson() < v) {
                result.add(c);
            }
        }
        if (result.isEmpty()) return null;
        result.sort(Comparator.comparingInt(Course::getHandson));
        return result.toArray(new Course[0]);
    }
}
