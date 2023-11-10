package team.jit;

class A  {
    int i;
    void foo () {
        System.out.println("Foo from A " + i);
    }
}

class B extends A  {
    int i;
    @Override
    void foo () {
        System.out.println("Foo from B " + i);
    }
}

class C extends B  {
    int i;
    @Override
    void foo () {
        System.out.println("Foo from C " + i);
    }

}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();

        ((B)c).i = 1;
        c.i = 10;

        a.foo();
        b.foo();
        c.foo();


        System.out.println(c.i + " " + ((B)c).i);

    }
}