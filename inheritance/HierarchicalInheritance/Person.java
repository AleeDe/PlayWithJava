public class Person {
    String Name;
    int Age;

    Person(){
        this.Name="Ali";
        this.Age=20;
    }
    Person(String Name, int Age){
        this.Name = Name;
        this.Age = Age; 
    }

    public void display(){
        System.out.println("Name :"+this.Name+" Age : "+this.Age);
    }
}
