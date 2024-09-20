public class Student {

    //    Student: name, studentID, maj
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

}
