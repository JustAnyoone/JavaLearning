package dev.lpa;

public class PlayingCard {

    private String suit;
    private String face;
    private int internalHash;

    public PlayingCard(String suit, String face) {
        this.suit = suit;
        this.face = face;
        this.internalHash = (suit.equals("Hearts")) ? 11 : 12;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((suit == null) ? 0 : suit.hashCode());
        result = prime * result + ((face == null) ? 0 : face.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlayingCard other = (PlayingCard) obj;
        if (suit == null) {
            if (other.suit != null)
                return false;
        } else if (!suit.equals(other.suit))
            return false;
        if (face == null) {
            if (other.face != null)
                return false;
        } else if (!face.equals(other.face))
            return false;
        return true;
    }

    


    // @Override
    // public int hashCode() {
    //     return internalHash;
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     System.out.println("--> Cheking Playing Card equality");
    //     return true;
    // }

    
}
