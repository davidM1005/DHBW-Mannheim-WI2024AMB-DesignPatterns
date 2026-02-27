package Builder;

public class Main {
    public static void main(String[] args) {

        Pizza bestellung1 = new Pizza.Builder("Groß")
                .mitKaese()
                .mitSalami()
                .build();
        System.out.println(bestellung1);

        Pizza bestellung2 = new Pizza.Builder("Klein")
                .mitKaese()
                .istVegetarisch()
                .build();
        System.out.println(bestellung2);
    }
}