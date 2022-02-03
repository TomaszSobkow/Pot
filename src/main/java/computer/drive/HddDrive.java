package computer.drive;

import computer.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HddDrive implements Drive{

     private List<File> files = new ArrayList<>();

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
                .filter(file -> file.getFileName().equals(fileNameToFind.getFileName()))
                .findFirst();
        System.out.println(fileFound.get().getFileName());
        return fileFound.orElseThrow();
    }
}
