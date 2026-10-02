package Section8_AdvancedOOP.Packages.com.acb.first;

public class Item {

    private String type;

    public Item(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item [type=" + type + "]";
    }

}
