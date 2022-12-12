public class ContaComum extends ContaCorrente {
    private float limite;

    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
        limite = 0;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
