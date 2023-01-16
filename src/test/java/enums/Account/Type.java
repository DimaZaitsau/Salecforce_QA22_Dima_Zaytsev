package enums.Account;

public enum Type {

    ANALYST("Analyst"), COMPETITOR("Competitor"), CUSTOMER("Customer"),
    INTEGRATOR("Integrator"), INVESTOR("Investor");

    private final String name;

    Type(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Type fromString(String value) {
        for (Type type : Type.values()) {
            if (type.getName().equals(value)) {
                return type;
            }
        }
        return null;
    }
}
