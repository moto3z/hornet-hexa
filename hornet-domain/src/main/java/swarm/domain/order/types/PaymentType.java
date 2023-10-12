package swarm.domain.order.types;

public enum PaymentType {
    KAKAO_PAY("카카오페이"),
    SSG_PAY("신세계페이"),
    PAYCO("페이코"),
    APPLE_PAY("애플페이"),
    COUPAY("쿠팡페이");

    private final String description;


    PaymentType(String description) {
        this.description = description;
    }
}
