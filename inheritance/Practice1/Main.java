class Main {
    public static void main(String[] args) {
        box obj1 = new box(1, 2, 3);
        // System.out.println(obj1.l);
        
        weight obj2 = new weight(4,2,3,5);
        // System.out.println(obj2.h);
        // System.out.println(obj2.w);
        
        weight  obj3 = new weight(2,2,3);
        // System.out.println(obj3.we);

        // box obj4 = new box(obj1);
        // System.out.println(obj4.h);
        weight obj5 = new weight(obj3);
        // System.out.println(obj5.we);

        price obj6 = new price();
        // System.out.println(obj6.price);
        // System.out.println(obj6.l);

        price obj7 = new price(obj5);
        System.out.println(obj7.price);

        
    }
}
