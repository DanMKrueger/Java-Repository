class Student{

    protected String id = "";
    public void generateID(int myInt){
        this.id = myInt;
    }

    public String getID(){
        return this.id;
    }

}
class GraduateStudent extends Student{

    public void generateID(int myInt){
            this.id = "g" + myInt;
    }

}
class UndergraduateStudent extends Student{

    public void generateID(int myInt){
        this.id = "u" + myInt;
    }

}

class ClassesExtendingExample{
    public static void main(String args[]){
        Student firstUndergrad = new UndergraduateStudent();
        Student firstGraduate = new GraduateStudent();
        Student secondUndergrad = new UndergraduateStudent();
        Student[] myStudents = {firstUndergrad, firstGraduate, secondUndergrad};
        int i = 0;
        for(Student s: myStudents){
            s.generateID(i);
            if(s instanceof GraduateStudent){
                System.out.println("Student: " + s.getID() + " is a gradutae student");
            }
            else{
                System.out.println("Student: " + s.getID() + " is an undergradutae student");
            }
            i++;
        }


    }
}