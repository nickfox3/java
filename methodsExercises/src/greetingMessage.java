public class greetingMessage {
    public static void greet(String name) {
    System.out.println("Hello " + name + "!");
    }
    public static void greet (String name, int age) {
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
    public static void main(String[] args) {
        greet("Nick");
        System.out.println();
        greet("Nicolas", 20);
    }
}