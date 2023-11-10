package team.jit;

import java.util.List;

abstract class Kaczka {
    void kwacz() {
        System.out.println("kwa, kwa, kwa!!!");
    }

    void lec() {
        System.out.println("Latam hen wysoko. Ale fajnie!!!");
    }

    void plywaj() {
        System.out.println("A ja płynę, płynę...");
    }

    abstract void wyswietl();
}

class DzikaKaczka extends Kaczka {
    @Override
    void wyswietl() {
        System.out.println("Jestem dzika kaczka");
    }
}

class GumowaKaczka extends Kaczka {
    @Override
    void wyswietl() {
        System.out.println("Jestem gumowa kaczka do kąpieli");
    }
}

class WabikKaczka extends Kaczka {
    @Override
    void wyswietl() {
        System.out.println("Jestem kaczką wabikem :(");
    }
}

public class Main {
    public static void main(String[] args) {
        List.of(new DzikaKaczka(), new GumowaKaczka(), new WabikKaczka())
                .forEach(k -> {
                    System.out.println("--------------------");
                    k.wyswietl();
                    k.kwacz();
                    k.lec();
                    k.plywaj();
                });



    }
}