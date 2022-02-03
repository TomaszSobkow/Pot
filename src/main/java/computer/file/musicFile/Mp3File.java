package computer.file.musicFile;

public class Mp3File extends AbstractMusicFile{

    private int quality;

    public Mp3File(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println(getClass().getSimpleName()+ " playing" );
    }

    public int getQuality() {
        return quality;
    }
}
