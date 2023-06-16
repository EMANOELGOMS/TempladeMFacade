//USANDO O PADRÃO FACADE
public class FacadePagamento {
    private Pix pix = new Pix();

    // public MetodoPagamento(Pix pix){
    //     pix.exibirComprovante();

    // }

//     public void pagarCompra(Compra compra) {
//         pix.detalhesPagamentos(compra);

//}
    public void cancelarPagamento(Compra compra) {   
        System.out.println("O pagamento foi cancelado");
        pix.compraFinalizada(compra);

    }

    public void pagarComPix(Compra compra){
        pix.detalhesPagamentos(compra);
        //cancelarPagamento(compra);
    }

    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }
    
}
