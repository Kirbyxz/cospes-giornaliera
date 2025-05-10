package org.cospessardegna.giornaliera.Entities;

import java.util.Objects;

public class CustomerCostCenterId {

    private Integer customerId;
    private Integer costCenterId;

    public CustomerCostCenterId() {
    }

    public CustomerCostCenterId(Integer customerId, Integer costCenterId) {
        this.customerId = customerId;
        this.costCenterId = costCenterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerCostCenterId)) return false;

        CustomerCostCenterId that = (CustomerCostCenterId) o;

        return Objects.equals(customerId, that.customerId)
                &&
                Objects.equals(costCenterId, that.costCenterId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, costCenterId);
    }
}
