package FileSystemCompositeDesignPattern;

public class FileSystemMain {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        File homeFile_A = new File("homeFile_A");
        File homeFile_B = new File("homeFile_B");
        Directory user = new Directory("user");
        File userFile_A = new File("userFile_A");
        File userFile_B = new File("userFile_B");
        File userFile_C = new File("userFile_C");
        root.addFileOrDirectory(home);
        home.addFileOrDirectory(homeFile_A);
        home.addFileOrDirectory(homeFile_B);
        home.addFileOrDirectory(user);
        user.addFileOrDirectory(userFile_A);
        user.addFileOrDirectory(userFile_B);
        user.addFileOrDirectory(userFile_C);
        System.out.println("Printing root file structure");
        root.ls();
        System.out.println("cd into home directory and printing home file structure");
        home.ls();
        System.out.println("cd into user directory and printing user file structure");
        user.ls();
    }
}