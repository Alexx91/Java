package oop.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Songs {
    public static void main(String[] args) {
        TreeSet<Song> songs = new TreeSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/oop/collections/artists.txt"));

            String song;
            while ((song = reader.readLine()) != null) {
                String title = song.substring(0, song.indexOf('/'));
                String artist = song.substring(song.indexOf('/') + 1);

                Song songObject = new Song(title, artist);
                songs.add(songObject);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Song song: songs) {
            System.out.println(song);
        }
    }
}

