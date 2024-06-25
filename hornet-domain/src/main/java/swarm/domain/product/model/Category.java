package swarm.domain.product.model;


public enum Category {
    ELECTRONICS("전자 제품");
    private final String description;

    Category(final String description) {
        this.description = description;
    }
}
