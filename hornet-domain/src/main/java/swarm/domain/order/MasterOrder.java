package swarm.domain.order;

import java.time.LocalDateTime;
import swarm.domain.order.types.CommerceType;
import swarm.domain.order.types.PaymentType;

public class MasterOrder {
    private String masterOrderCode;

    private CommerceType commerceType;
    private String commerceOrderLinkedId;

    private PaymentType paymentType;
    private String paymentLinkedId;

    private LocalDateTime orderReceivedAt;
    private LocalDateTime payReceivedAt;
}
