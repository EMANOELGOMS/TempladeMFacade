public abstract class PadraoMethod {

    /*Metodos e os passos para permitir a implemetação em outas subclasses */

    final void detalhesPagamentos(Compra compra){ 
        if(realizarValidacao(compra)){

            realizarPagamento(compra);
            compraAprovada(compra);
            realizarTransacao(compra);
            realizarValidacao(compra);
            CompraFinalizada(compra);
            exibirComprovante(compra);
        }else{
            System.out.println("Pedido inválido. Não pode ser processado.");
            }
        }

    abstract void realizarPagamento(Compra compra);
    abstract boolean realizarValidacao(Compra compra); 
    abstract void compraAprovada(Compra compra);
    abstract void realizarTransacao(Compra compra);
    abstract void CompraFinalizada(Compra compra);
    abstract void exibirComprovante(Compra compra);

    // if (compraAprovada == true)
            //CompraAprovada //pagamento realizado com sucesso
            //RealizandoTransação
            //ExibirComprovante
            //PedidoEnviado
            //PedidoEntregue



}


    
