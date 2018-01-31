package Iterator;

public class MusicDatabaseIterator implements IIterator {
    private MusicDatabase musicDatabase;
    private int index;

    public MusicDatabaseIterator (MusicDatabase musicDatabase){
        this.musicDatabase = musicDatabase;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < musicDatabase.getSize();
    }

    @Override
    public Object next() {
        Music song = musicDatabase.getSongAt(index);
        index++;
        return song;
    }
}
