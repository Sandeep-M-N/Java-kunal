package interfaces.Nested;

public class A {
    public interface nestedinterface{
        boolean isodd(int num);
    }
}
class B implements A.nestedinterface{

    @Override
    public boolean isodd(int num) {
        return(num & 1)==1;
    }
}
