package DirectorySystem.Directory;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Directory {
   public List<Directory>directories=new ArrayList<>();
    @Override
    public void getName() {
        int n=directories.size();
        for(int i=0;i<n;i++)
        {
            directories.get(i).getName();
        }

    }
    public void addDirectory(Directory directory)
    {
        directories.add(directory);
    }
    public void removeDirectory(Directory directory)
    {
        directories.remove(directory);
    }
}
