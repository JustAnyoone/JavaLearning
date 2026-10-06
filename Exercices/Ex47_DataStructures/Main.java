package Ex47_DataStructures;

public class Main {
        public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.addItem(new Node(5));   // 5 autoboxed to Integer
        list.addItem(new Node(2));
        list.addItem(new Node(8));
        list.traverse(list.getRoot()); // prints 2, 5, 8

        SearchTree tree = new SearchTree(null);
        tree.addItem(new Node(5));
        tree.addItem(new Node(2));
        tree.addItem(new Node(8));
        tree.traverse(tree.getRoot()); // prints 2, 5, 8 (in-order)
    }
}
