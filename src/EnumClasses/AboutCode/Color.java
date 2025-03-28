package EnumClasses.AboutCode;

public enum Color {
    RED("#123"),
    BLUE("#456"),
    GREEN("#789");
    private String code;
    Color(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}

