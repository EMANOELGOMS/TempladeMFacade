import java.util.List;

public interface Compra {
    List<Product> getProdutos();
    void addproduto(Product produto);
    double calcularCompra();
    void dadosdaCompra(Compra compra,String idCompras, String dataCompra); 

}
