public class Pix extends PadraoMethod {

         

     @Override
    void exibirProdutos(Compra compra) {
        System.out.println("Itens da Compra");        
        for(Product produto : compra.getProdutos()){
            System.out.println("-   " + produto.getNome() + " (R$" + produto.getPreco() + ")");
        }    
        System.out.println("");   
        
        System.out.println("        Valor À PAGAR: R$"+compra.calcularCompra());
        
    }
    @Override
    void realizarPagamento(Compra compra) {
        System.out.println("===========================================");
        System.out.println("REALIZANDO PAGAMENTO COM PIX");
        exibirProdutos(compra);
         

    }

     @Override
    void compraAprovada(Compra compra) {
        System.out.println("    PROCESSANDO PAGAMENTO...");
        System.out.println("    PIX: COMPRA APROVADA");
        
        
    }

    @Override
    void exibirComprovante(Compra compra) {
        System.out.println("    PIX: EXIBIR COMPROVANTE");
       //String id = "213234";
       //String data = "12/12/12";
       exibirProdutos(compra);
        
        // System.out.println("==========================================="); 
        // System.out.println("COMPROVANTE DE PAGAMENTO");
        // System.out.println("Itens da Compra"); 
              
        // for(Product produto : compra.getProdutos()){
        //     System.out.println("- " + produto.getNome() + " (R$" + produto.getPreco() + ")");
        // }    
        // System.out.println("");   
        
        // System.out.println("Código da compra: "+id); 
        // System.out.println("Data da compra: "+data);
        // System.out.println("Valor À PAGAR: R$"+compra.calcularCompra());
        // System.out.println("===========================================");
    }


    @Override
    void realizarTransacao(Compra compra) {
        System.out.println("PIX: REALIZANDO TRANSAÇÃO");
    }

    @Override
    void compraFinalizada(Compra compra) {
        System.out.println("PIX: COMPRA FINALIZADA");
        
    }

    @Override
    void pedidoEnviado() {
        
        System.out.println("PIX: O PEDIDO ESTA SENDO ENVIADO");
        System.out.println("==========================================="); 
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

