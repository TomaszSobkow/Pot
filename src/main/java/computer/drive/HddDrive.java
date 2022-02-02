package computer.drive;

import computer.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HddDrive implements Drive{

    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        files.forEach(files-> System.out.println(files.getFileName()));

    }

    @Override
    public File findFile(File fileNameToFind) {
        Optional<File> fileFound = files.stream()
                .filter(file -> file.getFileName().equals(fileNameToFind))
                .findFirst();
        return fileFound.orElseThrow();
    }
}
