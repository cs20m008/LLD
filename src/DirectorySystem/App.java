package DirectorySystem;

import DirectorySystem.Directory.Directory;
import DirectorySystem.Directory.Folder;
import DirectorySystem.Directory.Movie;

public class App {
    public static void directorySystemMain()
    {
        Directory mainDirectory=new Folder();
        Directory Directory1comedy=new Folder();
        Directory Directory1horror=new Folder();
        Directory Directory2Ajay=new Folder();

        Directory movie1=new Movie("kaal");
        Directory movie2=new Movie("joker");
        Directory movie3=new Movie("ABCD");
        Directory movie4=new Movie("sunday");
        Directory movie5=new Movie("golmal");
        mainDirectory.addDirectory(Directory1comedy);
        mainDirectory.addDirectory(Directory1horror);
        mainDirectory.addDirectory(movie3);
        Directory1horror.addDirectory(movie1);
        Directory1comedy.addDirectory(movie2);
        Directory1comedy.addDirectory(Directory2Ajay);
        Directory2Ajay.addDirectory(movie4);
        Directory2Ajay.addDirectory(movie5);
        mainDirectory.getName();





    }
}
