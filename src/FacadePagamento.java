//USANDO O PADRÃO FACADE
public class FacadePagamento {
    private Pix pix = new Pix();

    // public MetodoPagamento(Pix pix){
    //     pix.exibirComprovante();

    // }

    //public void realizarPagamento(Pix pix, double valor) {
    public void realizarPagamento(Compra compra) {
        //pix = new Pix();

        System.out.println("REALIZANDO PAGAMENTO COM PIX");
        System.out.println("Valor: "+compra.calcularCompra());

        pix.detalhesPagamentos();

}

    //Valide como será os comando que será feito no metódo
    public void cancelarPagamento(Compra compra) {
   
        System.out.println("O pagamento foi cancelado");
        pix.CompraFinalizada();

    }

    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }
    
}
