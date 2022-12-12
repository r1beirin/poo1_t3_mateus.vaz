public class UsaBanco {
    public static void main(String[] args){
        ContaEspecial ce = new ContaEspecial(1000, 12345, 123, 0);
        ContaEspecial ce2 = new ContaEspecial(123.40f, 12345, 123, 1500);
        ContaComum cc = null;

        if(ce.getLimite() == 0) {
            cc = new ContaComum(ce.getSaldo(ce.getSenha()), ce.getNumConta(), ce.getSenha());
        }

        System.out.println(cc.getSaldo(ce.getSenha()));
        cc.debitaValor(150);
        System.out.println(cc.getSaldo(ce.getSenha()));

        System.out.println(ce2.getSaldo(ce2.getSenha()));
    }
}
