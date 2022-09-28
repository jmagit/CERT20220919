/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exceptions;

/**
 *
 * @author Javier
 */
public class DemosException extends Exception {
    private static final String LITERAL = "Application exception";
    
    public DemosException() {
        this(LITERAL);
    }

    public DemosException(String message) {
        super(message);
    }

    public DemosException(String message, Throwable cause) {
        super(message, cause);
    }

    public DemosException(Throwable cause) {
        this(LITERAL, cause);
    }

    public DemosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
