package swarm.domain.product.dong.item;

import java.util.List;

public class MasterLot {

    public MasterLot(Long masterLotId) {
        this.masterLotId = masterLotId;
    }

    private Long masterLotId;

    public Long getMasterLotId() {
        return masterLotId;
    }
}
