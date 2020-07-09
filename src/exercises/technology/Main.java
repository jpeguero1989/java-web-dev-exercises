package exercises.technology;

public class Main {
    public static void main(String[] args)
    {
        Laptop myLaptop = new Laptop("jj",10,128,500);
        System.out.println(myLaptop.getId());
        SmartPhone myPhone = new SmartPhone("dd",25,64,36);
        System.out.println(myPhone.getId());

        Computer myPc = new Computer("dd",25,64,36);
        System.out.println(myPc.getId());
    }
}
