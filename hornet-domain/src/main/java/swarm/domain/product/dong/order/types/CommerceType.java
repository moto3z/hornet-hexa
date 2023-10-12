package swarm.domain.product.dong.order.types;

public enum CommerceType {
    _11ST(""),
    NAVER(""),
    CUPANG(""),
    SSG("");

    private final String description;

    CommerceType(String description) {
        this.description = description;
    }
}
