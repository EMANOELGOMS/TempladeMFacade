import java.util.ArrayList;
import java.util.List;

public class CompraComum implements Compra{
    
   private List<Produto> produtos;

    //construtor
    public CompraComum() {
        this.produtos = new ArrayList<>();
    }

    //add produtos
    @Override
    public void addproduto(Produto produto) {
        produtos.add(produto);
        
    }
    //soma os preços de cada  produto
    @Override
    public double calcularCompra() {

        double total = 0.0;

        for(Produto produto:produtos){
            total += produto.getPreco();

        }

       return total;
    }
    
    @Override
    public List<Produto> getProdutos() {
        
        return produtos;
    }

}
