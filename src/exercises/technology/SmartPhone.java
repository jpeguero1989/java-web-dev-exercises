package exercises.technology;

public class SmartPhone extends Computer {

    public SmartPhone(String name, int speed, int memorySize, int storageSize) {
        super(name, speed, memorySize, storageSize);
    }

    private boolean infraRed;

    public boolean isInfraRed() {
        return infraRed;
    }

    public void setInfraRed(boolean infraRed) {
        this.infraRed = infraRed;
    }
}
