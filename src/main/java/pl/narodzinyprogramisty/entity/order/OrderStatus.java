package pl.narodzinyprogramisty.entity.order;

public enum OrderStatus {
    NEW("new"),
    WAITING("waiting"),
    IN_REALIZATION("in realization"),
    DONE("done"),
    CANCEL("cancel"),
    OTHER("other");


    private String type;

    OrderStatus(String type) {
        this.type = type;
    }

    public static OrderStatus getStatus(String value) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.type.equals(value)) {
                return orderStatus;
            }
        }
        return OTHER;
    }
}
