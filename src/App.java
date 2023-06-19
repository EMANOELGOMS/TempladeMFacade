public class App {
    public static void main(String[] args) throws Exception {

        // criando a compra
        Compra compra = new CompraComum();

        // criação dos produtos
        Produto item1 = new Produto("Camiseta", 30);
        Produto item2 = new Produto("Calça", 60);
        Produto item3 = new Produto("Tenis", 100);

        // adicionando itens no carrinho
        compra.addproduto(item1);
        compra.addproduto(item2);
        compra.addproduto(item3);

        


        System.out.println("");

        FacadePagamento Pagamento = new FacadePagamento();
        //Pagamento.pagarComPix(purchase);
        Pagamento.pagarCartaoCredito(compra);
        Pagamento.PagarDebito(compra);




        //System.out.println("");
        //System.out.println("    PEDIDO CANCELADO (... em breve)");
        //Pagamento.cancelarPagamento(purchase);



        /*
         * 
         * É importante ressaltar que o padrão Facade não “encapsula” as interfaces do
         * sistema, o padrão Facade apenas fornece uma interface simplificada para
         * acessar as suas funcionalidades
         * 
         * Tendo uma Facade precisaríamos apenas construir um método que agrupe todas
         * essas classes e chame todos esses métodos
         * 
         * Assim, quando usuário quiser fazer essa operação ele chamaria apenas a Facade
         * que realizaria essa operação, simplificando muito todo o processo com uma
         * simples interface.
         * 
         * 
         * A definição oficial do padrão Facade é: “O Padrão Facade fornece uma
         * interface unificada para um conjunto de interfaces em um subsistema. O Facade
         * define uma interface de nível mais alto que facilita a utilização do
         * subsistema”.
         * 
         * 
         * 
         * 
         * 
         * // Subsistemas
class Estoque {
    public boolean verificarDisponibilidade(String produto) {
        System.out.println("Verificando disponibilidade do produto: " + produto);
        // Lógica para verificar a disponibilidade do produto no estoque
        return true;
    }
}

class Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento no valor de: R$" + valor);
        // Lógica para processar o pagamento
    }
}

class Envio {
    public void enviarPedido(String produto, String endereco) {
        System.out.println("Enviando pedido do produto: " + produto + " para o endereço: " + endereco);
        // Lógica para enviar o pedido ao cliente
    }
}

// Fachada
class SistemaPedidosFacade {
    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;

    public SistemaPedidosFacade() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.envio = new Envio();
    }

    public void processarPedido(String produto, double valor, String endereco) {
        boolean disponibilidade = estoque.verificarDisponibilidade(produto);

        if (disponibilidade) {
            pagamento.processarPagamento(valor);
            envio.enviarPedido(produto, endereco);
            System.out.println("Pedido processado com sucesso!");
        } else {
            System.out.println("Produto indisponível no estoque. Pedido não processado.");
        }
    }
}

// Exemplo de uso
public class SistemaGerenciamentoPedidos {
    public static void main(String[] args) {
        SistemaPedidosFacade facade = new SistemaPedidosFacade();

        String produto = "Camiseta";
        double valor = 49.99;
        String endereco = "Rua Principal, 123";

        facade.processarPedido(produto, valor, endereco);
    }
}

         */
    }
}
