package com.silnepalce.expensescheduler.expense.model;

import javax.persistence.*;

@Entity
@Table(name = "EXPENSE_TYPE")
public class ExpenseType {

    @Id
    @SequenceGenerator(name = "EXPENSE_TYPE_ID_GENERATOR", sequenceName = "EXPENSE_TYPE_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPENSE_TYPE_ID_GENERATOR")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "DESCRIPTION")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
