package Iterator;

public class MusicDatabaseIterator implements IIterator {
    private MusicDatabase musicDatabase;
    private int index;

    public MusicDatabaseIterator (MusicDatabase musicDatabase){
        this.musicDatabase = musicDatabase;
        this.index = 0;
    }

    @Override
    public void reset(){
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < musicDatabase.getSize();
    }

    @Override
    public Object next() {
        if (!hasNext()) reset();
        Music song = musicDatabase.getSongAt(index);
        index++;
        return song;
    }

    @Override
    public Object before() {
        if (index > 0) index--;
        else index = musicDatabase.getSize()-1;
        Music song = musicDatabase.getSongAt(index);
        return song;
    }

    @Override
    public String toString() {
        return "Music";
    }
}
