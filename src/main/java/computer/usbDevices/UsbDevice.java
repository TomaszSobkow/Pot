package computer.usbDevices;

public interface UsbDevice {

    boolean connect();
    boolean disconnect();
    String getName();


}
