package Ex48_ImplementingISaveable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        System.out.println(player); // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

        List<String> savedData = player.write();
        System.out.println(savedData); // [Tim, 10, 15, Sword]

        Player loadedPlayer = new Player("", 0, 0);
        loadedPlayer.read(savedData);
        System.out.println(loadedPlayer); // Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println(monster); // Monster{name='Werewolf', hitPoints=20, strength=40}
    }
}
