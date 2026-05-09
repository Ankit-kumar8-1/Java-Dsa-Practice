package SOLID;

public class Singleton {

    private  static   Singleton instance;

    private Singleton(){
        System.out.println("DataBases Connected !");
    }


    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();

        Singleton object2  = Singleton.getInstance();

    }
}
