package computer.file.imagefile;


public class JPGImageFile extends AbstractImageFile{


    private int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }

    public  void displayImage(){
        System.out.println(getClass().getSimpleName()+ " is displaying");
    }

    public int getCompression() {
        return compression;
    }

    public void setCompression(int compression) {
        this.compression = compression;
    }



}
