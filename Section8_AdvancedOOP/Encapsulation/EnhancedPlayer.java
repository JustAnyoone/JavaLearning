package Section8_AdvancedOOP.Encapsulation;

public class EnhancedPlayer {
    
    private String fullName;
    private int healtPercentage;
    private String weapon;

    

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String name, int healt, String weapon) {

        this.fullName = name;
        if (healt <= 0 ) {
            this.healtPercentage = -1;
        } else if (healt > 100) {
            this.healtPercentage = 100;
        } else {
             this.healtPercentage = healt;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){

        healtPercentage = healtPercentage - damage;
        if (healtPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healtReamining(){
        return healtPercentage;
    }

    public void restoreHealth(int extraHealth){

        healtPercentage = healtPercentage + extraHealth;
        if (healtPercentage > 100) {
            System.out.println("Player restored to 100%");
            healtPercentage = 100;
        }
    }

    @Override
    public String toString() {
        return "EnhancedPlayer [fullName=" + fullName + ", healtPercentage=" + healtPercentage + ", weapon=" + weapon
                + "]";
    }

}   
