package computer;

import computer.drive.HddDrive;
import computer.drive.SsdDrive;
import computer.file.File;
import computer.file.musicFile.Mp3File;
import computer.usbDevices.Mouse;
import computer.usbDevices.PenDrive;
import computer.usbDevices.UsbDevice;

public class ComputerApp {

    public static void main(String[] args) {

        PenDrive pendrive = new PenDrive("Sundisck");
        UsbDevice mouse = new Mouse("Mouse");
        Mp3File mp3File = new Mp3File("Music.wav",9000,"techno","Haven",360);


        Computer computer = new Computer(new Monitor(), new HddDrive());
        computer.addUsbDevice(pendrive);
        computer.deleteUsbDevice(pendrive);
        computer.getDrive().addFile(new Mp3File("Music.wa",3444,"2unlimited","Real thing",360));
        computer.getDrive().findFile(mp3File);
        pendrive.eject();
        computer.deleteUsbDevice(pendrive);

    }
}
