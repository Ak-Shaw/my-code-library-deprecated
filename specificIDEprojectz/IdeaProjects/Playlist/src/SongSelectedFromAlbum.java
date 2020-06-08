public class SongSelectedFromAlbum {

    private Song song;
    private Album album;

    public SongSelectedFromAlbum(Song song, Album album) {
        this.song = song;
        this.album = album;
    }

    public String toString() {
        return "Song Title: " + song.getTitle() + ", Duration: " + song.getDuration() + " s, Album: " + album.getTitle();
    }
}
