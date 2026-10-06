package Ex47_DataStructures;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
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
                return false; // duplicate
            } else if (cmp > 0) {
                ListItem left = current.previous();
                if (left == null) {
                    current.setPrevious(item);
                    return true;
                }
                current = left;
            } else {
                ListItem right = current.next();
                if (right == null) {
                    current.setNext(item);
                    return true;
                }
                current = right;
            }
        }
    }

    public boolean removeItem(ListItem item) {
        ListItem current = root;
        ListItem parent = null;
        while (current != null) {
            int cmp = current.compareTo(item);
            if (cmp == 0) {
                performRemoval(current, parent);
                return true;
            } else if (cmp > 0) {
                parent = current;
                current = current.previous();
            } else {
                parent = current;
                current = current.next();
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        ListItem left = item.previous();
        ListItem right = item.next();

        if (left == null && right == null) {
            replaceChild(parent, item, null);
        } else if (left == null) {
            replaceChild(parent, item, right);
        } else if (right == null) {
            replaceChild(parent, item, left);
        } else {
            ListItem successorParent = item;
            ListItem successor = right;
            while (successor.previous() != null) {
                successorParent = successor;
                successor = successor.previous();
            }
            item.setValue(successor.getValue());
            performRemoval(successor, successorParent);
        }
    }

    private void replaceChild(ListItem parent, ListItem oldChild, ListItem newChild) {
        if (parent == null) {
            root = newChild;
        } else if (parent.previous() == oldChild) {
            parent.setPrevious(newChild);
        } else {
            parent.setNext(newChild);
        }
    }

    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        inorder(root);
    }

    private void inorder(ListItem node) {
        if (node == null) {
            return;
        }
        inorder(node.previous()); // left subtree
        System.out.println(node.getValue());
        inorder(node.next());     // right subtree
    }
}
