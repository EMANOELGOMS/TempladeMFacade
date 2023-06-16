//TEMPLATE METHOD
public abstract class PadraoMethod {

    /*Metodos e os passos para o processamento de pagamento*/

    final void detalhesPagamentos(Compra compra){ 
        if(realizarValidacao(compra)){
            exibirProdutos(compra);
            realizarPagamento(compra);
            compraAprovada(compra);
            realizarTransacao(compra);
            compraFinalizada(compra);
            exibirComprovante(compra);
            pedidoEnviado();
        }else{
            System.out.println("Pedido inválido. Não pode ser processado.");
            }
        }
        abstract void exibirProdutos(Compra compra);
        abstract void realizarPagamento(Compra compra);
        abstract boolean realizarValidacao(Compra compra); 
        abstract void compraAprovada(Compra compra);
        abstract void realizarTransacao(Compra compra);
        abstract void compraFinalizada(Compra compra);
        abstract void exibirComprovante(Compra compra);
        abstract void pedidoEnviado();

    // if (compraAprovada == true)
            //CompraAprovada //pagamento realizado com sucesso
            //RealizandoTransação
            //ExibirComprovante
            //PedidoEnviado
            //PedidoEntregue



}


    
