package computer;

public class Monitor {

    private int width = 3840;
    private int height = 1920;


    public void setLowResolution800x600(){
        this.width = 800;
        this.height = 600;
    }

    public void setHighResolution(){
        this. width = 3840;
        this.height = 1920;
    }

    public void getResolution(){
       System.out.println(this.width + "x"+ this.height);
    }




}
