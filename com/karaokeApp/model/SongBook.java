/**
 * Created by nathansass on 10/5/15.
 */

package com.karaokeApp.model;
import java.util.*; //should be more specific


public class SongBook {
    private List<Song> mSongs;

    public SongBook() {
        mSongs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public int getSongCount() {
        return mSongs.size();
    }
}
