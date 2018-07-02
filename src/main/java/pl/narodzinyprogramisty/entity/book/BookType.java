package pl.narodzinyprogramisty.entity.book;

public enum BookType {
    SCI_FI("sci-fi"),
    DRAMA("drama"),
    COMEDY("comedy"),
    OTHER("other");

    private String value;

    BookType(String value) {
        this.value = value;
    }

    public static BookType getType(String value) {
        for (BookType type : BookType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return OTHER;
    }
}
