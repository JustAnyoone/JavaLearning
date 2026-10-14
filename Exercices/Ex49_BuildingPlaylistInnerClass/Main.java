package Ex49_BuildingPlaylistInnerClass;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Song> playList = new LinkedList<>();
        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        System.out.println(album.addSong("Stormbringer", 4.6)); // false (duplicate)

        album.addToPlayList(2, playList);
        album.addToPlayList("Stormbringer", playList);
        System.out.println(playList);
    }
}
