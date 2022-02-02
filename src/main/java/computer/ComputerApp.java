package computer;

import computer.drive.HddDrive;
import computer.drive.SsdDrive;

public class ComputerApp {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        HddDrive hddDrive = new HddDrive();

        Computer computer = new Computer(new Monitor(),new SsdDrive() );

        computer.getDrive().addFile(new File("Picture.jpeg"));

        hddDrive.addFile(new File("programming.jpeg"));
        computer.getDrive().listFiles();
    }
}
