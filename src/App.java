public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LinkedList friends = new LinkedList();

        friends.displayList();

        friends.append("Toji");
        friends.append("Gojo");
        friends.displayList();
    }
}
