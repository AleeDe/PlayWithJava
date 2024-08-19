class Main {
    public static void main(String[] args) {
        object obj1 = new object(1);
        object obj2 = new object(1);

        // if (obj1.equals(obj2)){
        //     System.out.println("Hello World");
        // }

        // System.out.println(obj1 instanceof object);
        // System.out.println(obj1 instanceof b);
        Main obj3 = new Main();
        System.out.println(obj1.getClass().getName());
        System.out.println(obj3.getClass().descriptorString());
        
    }
}