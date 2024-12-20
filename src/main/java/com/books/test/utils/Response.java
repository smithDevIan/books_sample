package com.books.test.utils;

public enum Response {
    SUCCESS(0, Translator.toLocale("success")),
    FAILED(1, Translator.toLocale("failed"));

    private final ResponseStatus status;
    Response(int code,String message){this.status = new ResponseStatus(code,message);}

    public ResponseStatus status(){return status;}
}
