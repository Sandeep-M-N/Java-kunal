package OOPS.Packages.Static;
// outside class cannot be static
// because it does not depend on other classes.
public class InnerClasss {
    // innerclasses can be static or non-static
     static class test{
         String name;

        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // we cannot access class test when it is not declared as static, beacuse it depends object of InnerClass.
        // when we declare class test as static it deosn't depend on InnerClass.
        test a =new test("sandeep");
        test b=new test("divakar");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
