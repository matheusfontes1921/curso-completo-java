package exception;

public class DomainException extends RuntimeException {
    private String msg;
    public DomainException(String msg) {
        this.msg=msg;
    }
    public String getMsg() {
        return msg;
    }
}
