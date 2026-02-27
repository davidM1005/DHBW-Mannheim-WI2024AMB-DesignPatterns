package Builder;

public class Pizza {

    private final String groesse;
    private final boolean kaese;
    private final boolean salami;
    private final boolean vegetarisch;

    private Pizza(Builder builder) {
        this.groesse = builder.groesse;
        this.kaese = builder.kaese;
        this.salami = builder.salami;
        this.vegetarisch = builder.vegetarisch;
    }

    public static class Builder {
        private String groesse;
        private boolean kaese = false;
        private boolean salami = false;
        private boolean vegetarisch = false;

        public Builder(String groesse) {
            this.groesse = groesse;
        }

        public Builder mitKaese() {
            this.kaese = true;
            return this;
        }

        public Builder mitSalami() {
            this.salami = true;
            return this;
        }

        public Builder istVegetarisch() {
            this.vegetarisch = true;
            return this;
        }

        public Pizza build() {
            if (this.vegetarisch && this.salami) {
                throw new IllegalStateException("Fehler: Eine vegetarische Pizza darf keine Salami haben!");
            }
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza-Bestellung: [" +
                "Größe='" + groesse + '\'' +
                ", Käse=" + kaese +
                ", Salami=" + salami +
                ", Vegetarisch=" + vegetarisch +
                ']';
    }
}