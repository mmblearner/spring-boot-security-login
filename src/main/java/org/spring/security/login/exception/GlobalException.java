package org.spring.security.login.exception;

@SuppressWarnings("serial")
public class GlobalException extends RuntimeException{
    public GlobalException(String message){
        super(message);
    }
}
