public class Main {
    public static void main(String[] args) {
        // Create a linked list for Integer values
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Integer Linked List:");
        intList.display();

        // Remove an element and display again
        intList.remove(20);
        intList.display();

        // Create a linked list for String values
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("\nString Linked List:");
        stringList.display();

        // Remove an element and display again
        stringList.remove("Hello");
        stringList.display();
    }
}