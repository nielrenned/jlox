package lox;

class Return extends RuntimeException {
    private static final long serialVersionUID = 651536265464053187L;
    final Object value;

    Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}