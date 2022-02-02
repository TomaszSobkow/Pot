package computer.drive;

import computer.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SsdDrive implements Drive{

    Map<String , File > files = new HashMap<>();

    @Override
    public void addFile(File file) {
        files.put(file.toString(), file);
    }

    @Override
    public void listFiles() {
        Collection<File> values = files.values();
        values.forEach(file -> System.out.println(file.getFileName()));

    }

    @Override
    public File findFile(File fileNameToFind) {
        return files.get(fileNameToFind);
    }
}
