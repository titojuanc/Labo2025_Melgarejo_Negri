package BibliotecaViirtual;

public class MembershipLimitException extends RuntimeException {
    public MembershipLimitException() {
        super("Se alcanzó el límite admitido para tu nivel de membresía");
    }
}
