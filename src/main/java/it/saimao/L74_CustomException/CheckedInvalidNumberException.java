package it.saimao.L74_CustomException;

public class CheckedInvalidNumberException extends Exception {

    public CheckedInvalidNumberException(String errMsg) {
        super(errMsg);
    }

}
