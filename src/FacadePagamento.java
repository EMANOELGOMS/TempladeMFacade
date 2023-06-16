//USANDO O PADRÃO FACADE
public class FacadePagamento {
    //criando objeto PIX
    private Pix pix = new Pix();

    public void cancelarPagamento(Compra compra) {   
        System.out.println("O pagamento foi cancelado");
        pix.compraFinalizada(compra);
        pix.exibirProdutos(compra);

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
