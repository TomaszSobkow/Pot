package computer;

import computer.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;
    private HeadPhone headPhone;

    List<UsbDevices> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }


    public void setMonitor(Monitor monitor) { this.monitor = monitor; }
    public void setDrive(Drive drive) { this.drive = drive; }

    public void setUsbDevices(List<UsbDevices> usbDevices) { this.usbDevices = usbDevices; }

    public Monitor getMonitor() { return monitor; }
    public Drive getDrive() { return drive; }

    public HeadPhone getHeadPhone() { return headPhone; }
    public void setHeadPhone(HeadPhone headPhone) { this.headPhone = headPhone; }
}
