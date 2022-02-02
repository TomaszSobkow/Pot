package computer.drive;

import computer.File;

public interface Drive {

    void addFile(File file);
    void listFiles();
    File findFile(File fileNameToFind);
}
