package it.saimao.L74_CustomException;

public class UncheckedInvalidNumberException extends RuntimeException {
    public UncheckedInvalidNumberException(String errMsg) {
        super(errMsg);
    }
}
