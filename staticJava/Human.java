package staticJava;

public class Human {
    public static void main(String[] args) {
        System.out.println(HumanPro.pop);
        HumanPro human2 = new HumanPro(10000, false);
        System.out.println(HumanPro.pop);
        HumanPro human1 = new HumanPro(20,10000, false);
        System.out.println(HumanPro.pop);

    }
}
