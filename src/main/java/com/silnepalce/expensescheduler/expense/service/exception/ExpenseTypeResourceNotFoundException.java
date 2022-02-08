package com.silnepalce.expensescheduler.expense.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExpenseTypeResourceNotFoundException extends RuntimeException{

    public ExpenseTypeResourceNotFoundException(String message) {
        super(message);
    }

    public ExpenseTypeResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
