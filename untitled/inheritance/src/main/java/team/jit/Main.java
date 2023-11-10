package team.jit;

class A {
    int i,j;
    void showIJ() {
        System.out.println( String.format("i and j: %s, %s", i ,j));
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println( String.format("k: %s", k));
    }

    void sum() {
        System.out.println(String.format("sum i +j + k = %s", i + j + k ));
    }
}

public class Main {

    public static void main(String[] args) {

        B b = new B();
        b.i = 10;
        b.j = 20;
        b.k = 30;

        b.showIJ();
        b.showK();
        b.sum();


    }
}