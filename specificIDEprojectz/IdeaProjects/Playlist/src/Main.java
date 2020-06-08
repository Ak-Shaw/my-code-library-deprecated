/*

Create a program that implements a playlist for songs.
Create a song class having Title and Duration for a song.
The program will have an Album Class containing a list of songs.
The albums will be stored in an ArrayList.
Songs from different albums can be added to the playlist and will
appear in the list in the order they are added.
Once the songs have been added to the playlist, create a menu of options
to:

Quit,
Skip forward to the next song,
Skip backwards to a previous song,
Replay the current song,
List the songs in the playlist.

A song must exist in an album before it can be added to the
playlist(so you only play songs that you own).

As an optional extra, provide an option to remove the current song
from the playlist [hint: listIterator.remove()]

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("No. of albums: ");
        int n = sc.nextInt();
        ArrayList<Album> albums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {

            System.out.print("Name for Album " + (i + 1) +": ");
            String albumName = sc.nextLine();
            Album album = new Album(albumName);
            System.out.print("No. of songs for album " + albumName + ": ");
            int numberOfSongs = sc.nextInt();

            for (int j = 0; j < numberOfSongs; j++) {

                System.out.print("Song " + (j + 1) + "title: ");
                String songTitle = sc.nextLine();
                System.out.print("Duration: ");
                double duration = sc.nextDouble();

                Song song = new Song(songTitle, duration);
                album.addSong(song);
            }

            albums.add(album);
        }


    }
}
