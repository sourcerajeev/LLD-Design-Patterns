package FileSystemCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> filesAndDirectories;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.filesAndDirectories = new ArrayList<>();
    }

    public void addFileOrDirectory(FileSystem filesAndDirectories) {
        this.filesAndDirectories.add(filesAndDirectories);
    }

    @Override
    public void ls() {
        System.out.println(directoryName);
        for (FileSystem fileSystem : filesAndDirectories) {
            fileSystem.ls();
        }
    }
}
