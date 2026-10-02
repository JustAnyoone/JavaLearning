package Section8_AdvancedOOP.Encapsulation;

public class Player {

    public String name;
    public int healt;
    public String weapon;

    public void loseHealth(int damage){

        healt = healt - damage;
        if (healt <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healtReamining(){
        return healt;
    }

    public void restoreHealth(int extraHealth){

        healt = healt + extraHealth;
        if (healt > 100) {
            System.out.println("Player restored to 100%");
            healt = 100;
        }
    }
}
