package com.silnepalce.expensescheduler.expense.api.dto.out;

public class ExpenseIdDTO {

    private Long id;

    private ExpenseIdDTO(Long id) {
        this.id = id;
    }

    public static ExpenseIdDTO from(Long id){
        return new ExpenseIdDTO(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ExpenseId{" +
                "id=" + id +
                '}';
    }
}
