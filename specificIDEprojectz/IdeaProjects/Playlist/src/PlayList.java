import java.util.LinkedList;

public class PlayList {

    private String title;
    private LinkedList<SongSelectedFromAlbum> playList;

    public PlayList(String title) {
        this.title = title;
        playList = new LinkedList<>();
    }

    public void addSong(SongSelectedFromAlbum selectedSong) {
        playList.add(selectedSong);
    }

    public void printPlayList() {
        for (int i = 0; i < playList.size(); i++) {
            System.out.println((i + 1) + ". " + playList.get(i));
        }
    }

    public String toString() {
        return "PlayList Title: " + title;
    }
}
