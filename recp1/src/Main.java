public class Main {
    public static void main(String[] args) {

        // 1. Cria o cardápio e adiciona produtos (AGREGAÇÃO)
        Cardapio cardapio = new Cardapio();

        Pizza margherita = new Pizza(1, "Pizza Margherita", 45.90, "Grande", "Mussarela e manjericão");
        Pizza calabresa = new Pizza(2, "Pizza Calabresa", 49.90, "Grande", "Calabresa com cebola");

        Adicional bordaCatupiry = new Adicional(3, "Borda de Catupiry", 8.00, "Borda recheada com catupiry");
        Adicional extraBacon = new Adicional(4, "Bacon extra", 6.50, "Porção extra de bacon");

        Bebida refrigerante = new Bebida(5, "Refrigerante 2L", 12.00, 2000);

        cardapio.adicionarProduto(margherita);
        cardapio.adicionarProduto(calabresa);
        cardapio.adicionarProduto(bordaCatupiry);
        cardapio.adicionarProduto(extraBacon);
        cardapio.adicionarProduto(refrigerante);

        cardapio.exibirCardapio();

        // 2. Personalização da pizza (AGREGAÇÃO: adicionais)
        margherita.setBordaRecheada(true);
        margherita.adicionarAdicional(extraBacon);

        // 3. Cadastro do cliente (ASSOCIAÇÃO)
        Endereco endereco = new Endereco("Rua das Flores", 123, "Centro", "São Paulo", "01000-000");
        Cliente cliente = new Cliente(1, "Maria Silva", "maria@email.com", "(11) 99999-0000", endereco);

        SistemaPizzaria sistema = new SistemaPizzaria(cardapio);
        sistema.cadastrarCliente(cliente);

        // 4. Montagem do pedido (COMPOSIÇÃO de itens + AGREGAÇÃO de cliente)
        Pedido pedido = new Pedido(1001, cliente, endereco);
        pedido.adicionarItem(margherita, 1);
        pedido.adicionarItem(refrigerante, 2);

        // 5. Pagamento via Pix (HERANÇA + polimorfismo)
        Pagamento pagamento = new PagamentoPix(pedido.calcularTotal(), "maria@email.com");
        pedido.setPagamento(pagamento);

        // 6. Fluxo completo no sistema
        sistema.receberPedido(pedido);
        pedido.confirmarPagamento();

        System.out.println("\nTotal do pedido: R$ " + String.format("%.2f", pedido.calcularTotal()));

        // 7. Atualizações de status (notificações instantâneas)
        sistema.atualizarStatusPedido(pedido, StatusPedido.SAIU_PARA_ENTREGA);
        sistema.atualizarStatusPedido(pedido, StatusPedido.CONCLUIDO);

        // 8. Histórico
        sistema.historicoPedidos(cliente);
    }
}