public class ContaEspecial extends ContaCorrente{
    private float limite;
    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}
