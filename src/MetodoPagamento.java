//USANDO O PADRÃO FACADE
public class MetodoPagamento {
    private Pix pix = null;

    // public MetodoPagamento(Pix pix){
    //     pix.exibirComprovante();

    // }

    //public void realizarPagamento(Pix pix, double valor) {
    public void realizarPagamento(Compra compra) {
    // Lógica para realizar o pagamento via Pix
        System.out.println("Realizando pagamento com pix");

        // pix.detalhesPagamentos();
        // pix.exibirComprovante();
        // pix.exibirFormularioPagamento();
        // pix.realizarTransacao();
        // pix.realizarTransacao();
}


    //Valide como será os comando que será feito no metódo
    public void cancelarPagamento() {
    // Lógica para cancelar o pagamento via Pix
    System.out.println("O pagamento com pix foi cancelado");

}

    public boolean validarPagamento(double valor) {
    // Lógica para validar os dados do pagamento
    // Retorne true se os dados do pagamento forem válidos, false caso contrário
    return true;
}


    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }
    
}
