package enumerations.ex4;

public enum Company {

    ITNVID(1000) {
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        @Override
        public String getCurrency() {
            return "USD";
        }
    },
    GOOGLE(100) {

        @Override
        public String getCurrency() {
            return "cents";
        }
    },
    SKYNET(10) {
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        @Override
        public String getCurrency() {
            return "eur";
        }
    };

    int value;

    Company(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();

    @Override
    public String toString() {
        return "Company " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }
}
