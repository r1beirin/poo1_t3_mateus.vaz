public abstract class ContaCorrente {
    private float saldo;
    private int estado; //  1 = conta ativa, 2 = conta inativa
    private int numConta;
    private int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; //  Conta ativa
    }

    public boolean debitaValor(float val, int pwd){
        /*
            Senha deve ser válida
            Conta deve ser ativa
            Val > 0
         */
        if(pwd != senha || estado != 1 || val <= 0 || val > saldo) return false;

        saldo -= val;

        if(saldo == 0) estado = 2;  // Conta torna inativa
        return true;
    }

    public void debitaValor(float val){
        saldo -= val;
    }

    public float getSaldo(int pwd){
        if(senha == pwd) return saldo;
        else return -1; //  Houve problema na senha
    }

    public void creditaValor(int pwd, float val){
        if(senha == pwd) saldo += val;
    }

    protected int getEstado(int pwd){
        if(senha == pwd) return estado;
        else return -1;
    }

    protected void setEstado(int pwd, int e){
        if(senha == pwd) estado = e;
    }

    protected boolean isSenha(int pwd){
        if(senha == pwd) return true;
        else return false;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getSenha() {
        return senha;
    }
}
