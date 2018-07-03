package pl.narodzinyprogramisty.entity.user;

public enum UserType {
    NORMAL("normal"),
    ADMIN("admin"),
    EMPLOYEE("employee"),
    OTHER("other");

    private String type;

    UserType(String type) {
        this.type = type;
    }

    public static UserType getType(String value) {
        for (UserType type : UserType.values()) {
            if (type.type.equals(value)) {
                return type;
            }
        }
        return OTHER;
    }
}
