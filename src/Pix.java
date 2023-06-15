public class Pix extends PadraoMethod {

         
    @Override
    void exibirComprovante() {
        System.out.println("PIX: EXIBIR COMPROVANTE");
    }


    @Override
    void realizarTransacao() {
        System.out.println("PIX: REALIZAR TRANSAÇÃO");
    }


    @Override
    void CompraAprovada() {
        System.out.println("PIX: COMPRA APROVADA");
    }


    @Override
    void CompraFinalizada() {
        System.out.println("PIX: COMPRA FINALIZADA");
        
    }


    @Override
    boolean realizarValidacao() {        
        // Lógica de validação do pedido
        return true;
    
    }
}
