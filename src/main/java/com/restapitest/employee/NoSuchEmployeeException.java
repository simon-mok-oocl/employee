package com.restapitest.employee;

public class NoSuchEmployeeException extends Exception {
    public NoSuchEmployeeException()
    {
        super("No such employee");
    }
}
