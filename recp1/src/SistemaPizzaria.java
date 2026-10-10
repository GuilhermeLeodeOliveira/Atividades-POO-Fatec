import java.util.ArrayList;
import java.util.List;

public class SistemaPizzaria {
    private Cardapio cardapio;              // AGREGAÇÃO
    private List<Pedido> pedidos;           // ASSOCIAÇÃO
    private List<Cliente> clientes;         // ASSOCIAÇÃO

    // Construtor
    public SistemaPizzaria(Cardapio cardapio) {
        this.cardapio = cardapio;
        this.pedidos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Getters e Setters
    public Cardapio getCardapio() { return cardapio; }
    public void setCardapio(Cardapio cardapio) { this.cardapio = cardapio; }

    public List<Pedido> getPedidos() { return pedidos; }
    public List<Cliente> getClientes() { return clientes; }

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void receberPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        pedido.getCliente().adicionarPedido(pedido);
        System.out.println("Novo pedido #" + pedido.getId() + " recebido em tempo real!");
        emitirNotificacao(new Notificacao(
                "Seu pedido #" + pedido.getId() + " foi confirmado e já está em preparo!",
                pedido.getCliente()));
    }

    public void atualizarStatusPedido(Pedido pedido, StatusPedido novoStatus) {
        pedido.atualizarStatus(novoStatus);
        emitirNotificacao(new Notificacao(
                "Pedido #" + pedido.getId() + " agora está: " + novoStatus,
                pedido.getCliente()));
    }

    public void emitirNotificacao(Notificacao notificacao) {
        notificacao.enviar();
    }

    public void historicoPedidos(Cliente cliente) {
        System.out.println("\n===== HISTÓRICO DE PEDIDOS DE " + cliente.getNome().toUpperCase() + " =====");
        for (Pedido p : cliente.getPedidos()) {
            System.out.println("Pedido #" + p.getId() + " | Status: " + p.getStatus()
                    + " | Total: R$ " + String.format("%.2f", p.calcularTotal()));
        }
    }
}