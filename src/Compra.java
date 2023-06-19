import java.util.List;

public interface Compra {
    List<Produto> getProdutos();
    void addproduto(Produto produto);
    double calcularCompra();
  

}
