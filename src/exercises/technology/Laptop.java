package exercises.technology;

public class Laptop extends Computer{

    public Laptop(String name, int speed, int memorySize, int storageSize) {
        super(name, speed, memorySize, storageSize);
    }

    private String OS;
    private int screenSize;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
