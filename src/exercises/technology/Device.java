package exercises.technology;

public abstract class Device {
    private int id;
    private static int nextId=1;
    private String name;

    public Device()
    {
        id = nextId;
        nextId++;
    }

    public Device(String aName)
    {
        this();
        name = aName;
    }

    public int getId() {
        return id;
    }



}
