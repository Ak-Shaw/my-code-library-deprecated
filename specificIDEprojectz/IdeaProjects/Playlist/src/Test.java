public class Test {

    public static void main(String[] args) {

        Song song1 = new Song("ABC", 62);
        Song song2 = new Song("DEF", 56);

        Album album1 = new Album("Album1");

        album1.addSong(song1);
        album1.addSong(song2);

        System.out.println(album1);
        album1.printListOfSongs();

        SongSelectedFromAlbum selectedSong = new SongSelectedFromAlbum(song1, album1);

        System.out.println(selectedSong);

        PlayList playList = new PlayList("PlayList1");
        playList.addSong(selectedSong);

        System.out.println(playList);
        playList.printPlayList();
    }
}
