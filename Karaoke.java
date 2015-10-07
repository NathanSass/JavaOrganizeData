/**
 * Created by nathansass on 10/5/15.
 */
import com.karaokeApp.KaraokeMachine;
//import com.karaokeApp.model.Song;
import com.karaokeApp.model.SongBook;


public class Karaoke {

    public static void main(String[] args) {
//        Song song = new Song(
//                "Michael Jackson",
//                "Beat It",
//                "https://www.youtube.com/watch?v=SaEC9i9QOvk");
//        SongBook songBook = new SongBook();
//        System.out.printf("Adding %s %n", song);
//        songBook.addSong(song);
//        System.out.printf("There are %d songs. %n", songBook.getSongCount());
        SongBook songBook = new SongBook();
        KaraokeMachine machine = new KaraokeMachine(songBook);
        machine.run();

    }
}
