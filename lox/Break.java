package lox;

class Break extends RuntimeException {
    private static final long serialVersionUID = -1202492157724049442L;

    Break() {
        super(null, null, false, false);
    }
}