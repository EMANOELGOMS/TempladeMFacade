public class Pix extends PadraoMethod {

    @Override
    void exibirFormularioPagamento() {
        System.out.println("PIX: EXIBIR FORMULÁRIO");
    }


    @Override
    void realizarValidacao() {        
       
        System.out.println("PIX: VALIDAÇÃO DO PAGAMENTO");
    }


    @Override
    void exibirComprovante() {
        System.out.println("PIX: EXIBIR COMPROVANTE");
    }


    @Override
    void realizarTransacao() {
        System.out.println("Realizar Transação");
    }


      // private String keyPix;   
    
    // // poderá receber o cliente diretamento. 
    // private String namePix; 
    // private double valor;

    // //METODO DA CLASSE
    // public void validarDados(){
    //     System.out.println("Em breve");


    // }
    // //METODO DA CLASSE
    // public void realizarTransacao(){
    //     System.out.println("Em breve");

    // }

    //GETS E SETS
    // public String getKeyPix() {
    //     return keyPix;
    // }

    // public void setKeyPix(String keyPix) {
    //     this.keyPix = keyPix;
    // }
    // public String getNamePix() {
    //     return namePix;
    // }

    // public void setNamePix(String namePix) {
    //     this.namePix = namePix;
    // }

    // public double getValor() {
    //     return valor;
    // }

    // public void setValor(double valor) {
    //     this.valor = valor;
    // }


}
