public class SalarioNegativo extends IllegalStateException{
    SalarioNegativo(){

    }
    SalarioNegativo(String mensagem){
        super(mensagem);
    }
}
