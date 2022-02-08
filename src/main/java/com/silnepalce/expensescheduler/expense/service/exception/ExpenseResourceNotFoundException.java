package com.silnepalce.expensescheduler.expense.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExpenseResourceNotFoundException extends RuntimeException{

    public ExpenseResourceNotFoundException(String message) {
        super(message);
    }

    public ExpenseResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
