//USANDO O PADRÃO FACADE
public class FacadePagamento {
    //criando objeto PIX
    private Pix pix = new Pix();
    private CartaoCredito cartaoCredito = new CartaoCredito();
    private Debito debito = new Debito();

    // public void cancelarPagamento(Compra compra) {   
    //     System.out.println("O pagamento foi cancelado");
    //     pix.compraFinalizada(compra);
    //     pix.exibirProdutos(compra);

    // }
    public void PagarDebito(Compra compra){
        //cartao.getTipoCartao();
        debito.detalhesPagamentos(compra);
    }

    public void pagarComPix(Compra compra){
        pix.detalhesPagamentos(compra);
        //cancelarPagamento(compra);
    }
    public void pagarCartaoCredito(Compra compra){
        cartaoCredito.detalhesPagamentos(compra);
    }


    

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    public Pix getPix() {
        return pix;
    }

    public void setPix(Pix pix) {
        this.pix = pix;
    }
    public Debito getDebito() {
        return debito;
    }
    public void setDebito(Debito debito) {
        this.debito = debito;
    }
    
}
