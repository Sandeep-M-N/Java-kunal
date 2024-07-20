package OOPS.Packages.Singleton;
// singleton is used to create  only one object.
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static  Singleton getInstance(){
        // to check only one object
        if(instance==null){
            instance=new Singleton();
        }
        return  getInstance();

    }
}
