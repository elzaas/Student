public class Main {

    //    Student: name, studentID, major, GPA
    private static class Student {
        public String name;
        public int studentID;
        public String major;
        public double GPA;

        public Student(String name, int studentID, String major, double GPA) {
            this.name = name;
            this.studentID = studentID;
            this.major = major;
            this.GPA= GPA;
        }

        public Student() {
            name = "Asanova Elza Arstanbekovna";
            studentID = 230107007;
            major = "Managment in IT";
            GPA= 8.0;
        }

        public void displayInfo(){
            System.out.println("Name : " + name);
            System.out.println("StudentID : " +studentID);
            System.out.println("Major : " + major);
            System.out.println("GPA : " + GPA);
        }
        public static void main(String[] args) {
            //Car;make, model, year, price
            Student myStudent = new Student();
            myStudent.name="Asanova Elza Arstanbekovna";
            myStudent.studentID=230107007;
            myStudent.major="Managment in IT";
            myStudent.GPA=8.0;

            myStudent.displayInfo();
        }
    }
}
