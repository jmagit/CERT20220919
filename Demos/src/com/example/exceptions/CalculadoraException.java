/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.exceptions;

/**
 *
 * @author Javier
 */
public class CalculadoraException extends Exception {

    public CalculadoraException(String message) {
        super(message);
    }

    public CalculadoraException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculadoraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
