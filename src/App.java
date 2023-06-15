public class App {
    public static void main(String[] args) throws Exception {

        // criando a compra
        Compra purchase = new CompraComum();

        //criação dos produtos
        Product item1 = new Product("Camiseta", 30);
        Product item2 = new Product("Calça", 60);
        Product item3 = new Product("Tenis", 100);

        //adicionando itens no carrinho
        purchase.addproduto(item1);
        purchase.addproduto(item2);
        purchase.addproduto(item3);




        System.out.println("Itens da Compra");
        for(Product produto: purchase.getProdutos()){
            System.out.println("- "+produto.getNome()+ " (" + produto.getPreco()+")");
        }

        System.out.println("Valor total: "+purchase.calcularCompra());
        

        System.out.println("");
        
        FacadePagamento pixPagamento = new FacadePagamento();

        
        pixPagamento.realizarPagamento(purchase);




        System.out.println("");
        System.out.println("    PEDIDO CANCELADO (... em breve)");

        pixPagamento.cancelarPagamento(purchase);
        
    

      
        /*
         * 
         * É importante ressaltar que o padrão Facade não “encapsula” as interfaces do sistema, o padrão Facade apenas fornece uma interface simplificada para acessar as suas funcionalidades
         * 
         * Tendo uma Facade precisaríamos apenas construir um método que agrupe todas essas classes e chame todos esses métodos
         * 
         * Assim, quando usuário quiser fazer essa operação ele chamaria apenas a Facade que realizaria essa operação, simplificando muito todo o processo com uma simples interface.
         * 
         * 
         * A definição oficial do padrão Facade é: “O Padrão Facade fornece uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma interface de nível mais alto que facilita a utilização do subsistema”.
        */
    }
}
