package computer;

import computer.drive.HddDrive;
import computer.drive.SsdDrive;

public class ComputerApp {

    public static void main(String[] args) {



        Computer computer = new Computer(new Monitor(),new SsdDrive() );

        computer.getDrive().addFile(new File("Picture.jpeg"));
        computer.getDrive().findFile(new File("tomasz"));


        computer.getDrive().listFiles();
    }
}
