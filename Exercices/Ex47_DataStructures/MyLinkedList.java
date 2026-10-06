package Ex47_DataStructures;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }

        ListItem current = root;
        while (true) {
            int cmp = current.compareTo(item);
            if (cmp == 0) {
                return false; // duplicate — don't add
            } else if (cmp > 0) {
                ListItem prev = current.previous();
                item.setNext(current);
                item.setPrevious(prev);
                current.setPrevious(item);
                if (prev != null) {
                    prev.setNext(item);
                } else {
                    root = item;
                }
                return true;
            } else {
                ListItem next = current.next();
                if (next == null) {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
                current = next;
            }
        }
    }

    public boolean removeItem(ListItem item) {
        ListItem current = root;
        while (current != null) {
            int cmp = current.compareTo(item);
            if (cmp == 0) {
                ListItem prev = current.previous();
                ListItem next = current.next();
                if (prev != null) {
                    prev.setNext(next);
                } else {
                    root = next;
                }
                if (next != null) {
                    next.setPrevious(prev);
                }
                return true;
            } else if (cmp > 0) {
                return false; // passed where it would be — not found
            }
            current = current.next();
        }
        return false;
    }

    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        ListItem current = root;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.next();
        }
    }
}
