public class Pix extends PadraoMethod {

         
    @Override
    void realizarPagamento(Compra compra) {

        System.out.println("REALIZANDO PAGAMENTO COM PIX");
        System.out.println("Itens da Compra");        
        for(Product produto : compra.getProdutos()){
            System.out.println("- " + produto.getNome() + " (" + produto.getPreco() + ")");
        }       
        
        System.out.println("Valor À PAGAR: "+compra.calcularCompra());

    }

    @Override
    void exibirComprovante(Compra compra) {
        System.out.println("PIX: EXIBIR COMPROVANTE");
    }


    @Override
    void realizarTransacao(Compra compra) {
        System.out.println("PIX: REALIZAR TRANSAÇÃO");
    }


    @Override
    void compraAprovada(Compra compra) {
        System.out.println("PIX: COMPRA APROVADA");
    }


    @Override
    void CompraFinalizada(Compra compra) {
        System.out.println("PIX: COMPRA FINALIZADA");
        
    }


    @Override
    boolean realizarValidacao(Compra compra) {       
        // Lógica de validação do pedido
        return true;

    
    // double valorMinimo = 100.0;
    
    // // Obtém o valor total da compra
    // double valorCompra = obterValorCompra();
    
    // // Verifica se o valor total da compra é maior ou igual ao valor mínimo
    // if (valorCompra >= valorMinimo) {
    //     // A compra atende ao valor mínimo, então a validação é bem-sucedida
    //     return true;
    // } else {
    //     // A compra não atende ao valor mínimo, então a validação falha
    //     return false;
    // }
    }

    
}

