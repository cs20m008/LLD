package DirectorySystem.Directory;

public class Movie implements Directory{
    String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void addDirectory(Directory directory) {

    }
}
