import java.util.ArrayList;

public class Album {

    private String title;
    private ArrayList<Song> listOfSongs;

    public Album(String title) {

        this.title = title;
        listOfSongs = new ArrayList<>();
    }

    public void addSong(Song song) {
        listOfSongs.add(song);
    }

    public void printListOfSongs() {
        for (int i = 0; i < listOfSongs.size(); i++) {
            System.out.println((i + 1) + ". " + listOfSongs.get(i));
        }
    }

    public String toString() {
        return "Album Title: " + title + "\nNumber of Songs: " + listOfSongs.size();
    }

    public String getTitle() {
        return title;
    }
}
