package computer.usbDevices;

public class PenDrive implements UsbDevice{

    private String name;
    private boolean ejected;

    public PenDrive(String name) {
        this.name = name;
    }

    public void eject(){
        System.out.println("Ejecting USB Stick");
        ejected = true;
    }

    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean disconnect() {

        if(!ejected) {
            System.out.println("Please eject the stick memory first.");
            return false;
        }
        else {
            System.out.println("Disconnected");
            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
