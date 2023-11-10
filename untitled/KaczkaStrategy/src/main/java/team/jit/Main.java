package team.jit;

import java.util.List;



interface KwakanieStrategy {
    void kwacz();
}


interface LatanieStrategy {
    void lec();
}


interface WyswietlanieStrategy {
    void wyswietl();
}


class Kwakanie implements KwakanieStrategy {
    @Override
    public void kwacz() {
        System.out.println("kwa, kwa, kwa!!!");
    }
}

class CiszaKwakanie implements KwakanieStrategy {
    @Override
    public void kwacz() {
        System.out.println("Nie umime kwakac");
    }
}

class Piszczenie implements KwakanieStrategy {
    @Override
    public void kwacz() {
        System.out.println("Pi pi!!");
    }
}

class SuperLatanie implements LatanieStrategy {
    @Override
    public void lec() {
        System.out.println("Latam super wysoko");
    }
}

class Nielot implements LatanieStrategy {
    @Override
    public void lec() {
        System.out.println("Nie umiem latac :(");
    }
}

class DomyslnyPainter implements WyswietlanieStrategy {

    String name;

    public DomyslnyPainter(String name) {
        this.name = name;
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem sobie " +name);
    }
}


 class Kaczka {

    KwakanieStrategy kwakanie;
    LatanieStrategy latanie;
    WyswietlanieStrategy wyswietlanieStrategy;

    public Kaczka(KwakanieStrategy kwakanie, LatanieStrategy latanie, WyswietlanieStrategy wyswietlanieStrategy) {
        this.kwakanie = kwakanie;
        this.latanie = latanie;
        this.wyswietlanieStrategy = wyswietlanieStrategy;
    }

    void kwacz() {
        kwakanie.kwacz();
    }

    void lec() {
        latanie.lec();
    }

    void plywaj() {
        System.out.println("A ja płynę, płynę...");
    }

     void wyswietl() {
        wyswietlanieStrategy.wyswietl();
     }

     static Kaczka createDzikaKaczka() {
         return  new Kaczka(new Kwakanie(), new SuperLatanie(), new DomyslnyPainter("dziak kaczka"));
     }

     static Kaczka createGumowaKaczka() {
        return new Kaczka(new Piszczenie(), new Nielot(), new DomyslnyPainter("Gumowa Kaczka"));
     }

     static Kaczka createKaczkaWabik() {
         return new Kaczka(new CiszaKwakanie(), new Nielot(), new DomyslnyPainter("Wabik Kaczka"));
     }
}





public class Main {
    public static void main(String[] args) {
        List.of(Kaczka.createDzikaKaczka(), Kaczka.createGumowaKaczka(), Kaczka.createKaczkaWabik())
                .forEach(k -> {
                    System.out.println("--------------------");
                    k.wyswietl();
                    k.kwacz();
                    k.lec();
                    k.plywaj();
                });



    }
}