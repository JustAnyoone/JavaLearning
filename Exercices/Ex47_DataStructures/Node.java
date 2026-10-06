package Ex47_DataStructures;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    ListItem next() {
        return rightLink;
    }

    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    ListItem previous() {
        return leftLink;
    }

    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @SuppressWarnings("unchecked")
    int compareTo(ListItem item) {
        Comparable<Object> thisValue = (Comparable<Object>) this.value;
        return thisValue.compareTo(item.getValue());
    }
}