package staticJava;

public class HumanPro {
    static int age;
    int salary;
    boolean married;
    static long pop;

    HumanPro(int age, int salary, boolean married){
        HumanPro.age = age;
        this.salary = salary;
        this.married = married;
        HumanPro.pop++;       
    }
    HumanPro( int salary, boolean married){
        // HumanPro.age = age;
        this.salary = salary;
        this.married = married;
        HumanPro.pop++;         
    }
}