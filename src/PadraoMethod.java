public abstract class PadraoMethod {

    /*Metodos e os passos para permitir a implemetação em outas subclasses */

    final void detalhesPagamentos(){
        exibirFormularioPagamento(); 
        realizarTransacao();
        realizarValidacao();
        exibirComprovante();
        }

    abstract void exibirFormularioPagamento(); 
    abstract void realizarValidacao(); 
    abstract void realizarTransacao();
    abstract void exibirComprovante();

}


    
