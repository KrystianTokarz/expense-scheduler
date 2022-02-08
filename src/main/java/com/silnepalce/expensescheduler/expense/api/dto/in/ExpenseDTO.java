package com.silnepalce.expensescheduler.expense.api.dto.in;

//import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ExpenseDTO {

    public LocalDateTime dateTime;

//    @NotNull
    public BigDecimal amount;

//    @NotNull
    public Long type;


    public String description;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ExpenseDTO{" +
                "dateTime=" + dateTime +
                ", amount=" + amount +
                ", description=" + description + "" +
                ", type=" + type +
                '}';
    }

}
