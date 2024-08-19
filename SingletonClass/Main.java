class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("Ali");
        System.out.println(obj1.name);
        Singleton obj2 = Singleton.getInstance("Raza");
        System.out.println(obj2.name);
    }
}