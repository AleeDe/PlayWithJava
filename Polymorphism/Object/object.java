package Object;

public class object {
    int num;

    object(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        
        return ""+num;
    }
    public static void main(String[] args) {
        object obj1 = new object(10);
        System.out.println(obj1);
    }
}
