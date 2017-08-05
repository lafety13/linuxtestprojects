package ua.goit.java;

public enum Test {
    HOME("H"),
    MOBILE("M");

    private final String type;

    Test(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
