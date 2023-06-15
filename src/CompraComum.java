import java.util.ArrayList;
import java.util.List;

public class CompraComum implements Compra{
    
   private List<Product> produtos;

    //construtor
    public CompraComum() {
        this.produtos = new ArrayList<>();
    }

    //add produtos
    @Override
    public void addproduto(Product produto) {
        produtos.add(produto);
        
    }
    //soma os preços de cada  produto
    @Override
    public double calcularCompra() {

        double total = 0.0;

        for(Product produto:produtos){
            total += produto.getPreco();

        }

       return total;
    }
    
    @Override
    public List<Product> getProdutos() {
        
        return produtos;
    }
}
