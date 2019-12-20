public class JukeBox {
    private CDPlayer cdPlayer;
    private User user;
    private Set<CD> cdCollection;
    private SongSelector ts;

    public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector ts ) {};
    public void setUser(User u) { this.user = u; }
    public Song getSong() { return ts.getCurrentSong(); }
}

public class CDPlayer {
    private CD c;
    private Playlist p;

    public CDPlayer(CD c, Playlist p) {};
    public CDPlayer(Playlist p) { this.p = p; }
    public CDPlayer(CD c) { this.c = c; }

    public void playSong(Song s) {};

    public Playlist getPlaylist() { return p; }
    public void setPlaylist(Playlist p) { this.p = p; }

    public CD getCD() { return c; }
    public void setCD() { this.c = c; }
}

public class Playlist {
    private Song song;
    private Queue<Song> queue;
    public Playlist(Song song, Queue<Song> queue) {};

    public Song getNextSToPlay() {
        return queue.peek();
    }
    public void queueNextSong() {
        queue.add(s);
    }
}
