package exercises.technology;

public class Computer extends Device{
    private String name;
    private int speed;
    private int memorySize;
    private int storageSize;

    public Computer(String name, int speed, int memorySize, int storageSize) {
        super(name);
        this.name = name;
        this.speed = speed;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public boolean addMemory(int memorySize)
    {
        this.memorySize += memorySize;
        return true;
    }

    public boolean addSpace(int storageSize)
    {
        this.storageSize += storageSize;
        return true;
    }
}
