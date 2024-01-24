public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList friends = new LinkedList();

        friends.displayList();

        friends.append("Toji");
        friends.append("Gojo");
        friends.displayList();

        System.out.println("git change test");

        System.out.println("New Branch");
    }
}
