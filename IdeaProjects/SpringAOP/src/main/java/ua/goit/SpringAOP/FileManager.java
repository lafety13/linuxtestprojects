package ua.goit.SpringAOP;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;

@Component("fileManager")
public class FileManager {
    public Set<String> getFolderList(String path) {
        File file = new File(path);

        Set<String> treeFolder = new TreeSet<>();

        for (String fileName : file.list()) {
            treeFolder.add(fileName);
        }

        return treeFolder;
    }

}
