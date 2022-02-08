package com.silnepalce.expensescheduler.expense.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "EXPENSE")
public class Expense {

    @Id
    @SequenceGenerator(name = "EXPENSE_ID_GENERATOR", sequenceName = "EXPENSE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "EXPENSE_ID_GENERATOR", strategy = GenerationType.SEQUENCE)
    private Long id;

    private BigDecimal cost;

    private LocalDateTime dateTime;

    private String description;

    @OneToOne
    @JoinColumn(name = "EXPENSE_TYPE")
    private ExpenseType expenseType;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
}
