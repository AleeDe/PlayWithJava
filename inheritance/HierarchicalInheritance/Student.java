public class Student extends Person{
    String student_ID;
    Student(){
        this.student_ID="Not Given";
    }
    Student(String student_ID){
        this.student_ID = student_ID; 
    }
    Student(String Name,int Age,String student_ID){
        super(Name, Age);
        this.student_ID = student_ID; 
    }
    public void display(){
        System.out.println("Name :"+this.Name+" Age : "+this.Age +" StudentID : "+student_ID);
    }
}
