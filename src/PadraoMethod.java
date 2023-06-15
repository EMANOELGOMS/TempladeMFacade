public abstract class PadraoMethod {

    /*Metodos e os passos para permitir a implemetação em outas subclasses */

    final void detalhesPagamentos(){ 
        if(realizarValidacao()){
            CompraAprovada();
            realizarTransacao();
            realizarValidacao();
            CompraFinalizada();
            exibirComprovante();
        }else{
            System.out.println("Pedido inválido. Não pode ser processado.");
            }
        }


    abstract boolean realizarValidacao(); 
    abstract void CompraAprovada();
    abstract void realizarTransacao();
    abstract void CompraFinalizada();
    abstract void exibirComprovante();

    // if (compraAprovada == true)
            //CompraAprovada //pagamento realizado com sucesso
            //RealizandoTransação
            //ExibirComprovante
            //PedidoEnviado
            //PedidoEntregue



}


    
