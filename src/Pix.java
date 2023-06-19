public class Pix extends PadraoMethod {

         

     @Override
    void exibirProdutos(Compra compra) {
        System.out.println("Itens da Compra");        
        for(Produto produto : compra.getProdutos()){
            System.out.println("    -   " + produto.getNome() + " (R$" + produto.getPreco() + ")");
        }    
        System.out.println("");   
        
        System.out.println("Valor À PAGAR: R$"+compra.calcularCompra());
        
    }
    @Override
    void realizarPagamento(Compra compra) {
        System.out.println("===========================================");
        System.out.println("REALIZANDO PAGAMENTO COM PIX");
        exibirProdutos(compra);
         

    }

     @Override
    void compraAprovada(Compra compra) {
        System.out.println("===========================================");
        System.out.println("PROCESSANDO PAGAMENTO...");
       
      
        
        System.out.println("===========================================");
        System.out.println("COMPRA APROVADA");
        //System.out.println("===========================================");
        
        
        
    }

    @Override
    void exibirComprovante(Compra compra) {
        System.out.println("===========================================");
        System.out.println("             EXIBIR COMPROVANTE");
        System.out.println("-------------------------------------------");
        String id = "213234";
        String data = "12/12/12";
        System.out.println("Código da compra: "+id);
        System.out.println("Data da compra: "+data);
       exibirProdutos(compra);
       System.out.println("===============================================");
      
    }


    @Override
    void realizarTransacao(Compra compra) {
        
        System.out.println("===========================================");
        System.out.println("REALIZANDO TRANSAÇÃO");
        System.out.println("===========================================");
        
    }

    @Override
    void compraFinalizada(Compra compra) {
        System.out.println("COMPRA FINALIZADA");
        
        
    }

    @Override
    void pedidoEnviado() {
        
        System.out.println("    PROCESSO DO PEDIDO");
        System.out.println("O PEDIDO ESTA SENDO ENVIADO");
        System.out.println("O pedido foi enviado com SUCESSO!! BEBE");
        System.out.println("==========================================="); 
    }

    @Override
    void pedidoEntregue(){
        
        System.out.println("O pedido esta na cidade do destina da entrega");
        System.out.println("O pedido foi entregue com SUCESSO!!");

    }


    @Override
    boolean realizarValidacao(Compra compra) {       
        
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

