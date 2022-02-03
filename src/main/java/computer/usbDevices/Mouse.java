package computer.usbDevices;

public class Mouse implements UsbDevice{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println( getClass().getSimpleName()+ " Connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Disconnected! ");
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
