public class Dog {
    String name;
    Integer weight;

    public void sayHello(String args) {
        System.out.println(args);
    }

    public static void main(String[] args) {
        System.out.println("Hello From Dog Class.\n");
        Dog dog1 = new Dog();
        dog1.sayHello("Wooo Wang, dog1");

        Dog dog2 = new Dog();
        dog2.sayHello("Hi, I'm dog2");
    }
}
