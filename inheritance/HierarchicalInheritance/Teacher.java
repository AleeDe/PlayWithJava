public class Teacher extends Person{
    String teacher_ID;
    Teacher(){
        this.teacher_ID="Not Given";
    }
    Teacher(String teacher_ID){
        this.teacher_ID = teacher_ID;
    }
    Teacher(String Name,int Age,String teacher_ID){
        super(Name, Age);
        this.teacher_ID = teacher_ID;
    }
    public void display(){
        System.out.println("Name :"+this.Name+" Age : "+this.Age +" TeacherID : "+teacher_ID);
    }
}
