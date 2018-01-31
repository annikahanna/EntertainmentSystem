package iterator;

public class MusicDatabase implements IAggregate {
    private Music[] songs;
    private int maximumindex = 0;

    public MusicDatabase (int maximumSize){
        songs = new Music[maximumSize];
    }

    public Music getSongAt(int index){
        return songs[index];
    }

    public void addSong(Music music){
        songs[maximumindex] = music;
        maximumindex++;
    }

    public int getSize(){
        return songs.length;
    }


    @Override
    public IIterator iterator() {
        return new MusicDatabaseIterator(this);
    }
}
