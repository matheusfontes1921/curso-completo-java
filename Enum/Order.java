import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;

    private List<OrderItem> itens = new ArrayList<>();

    private Cliente cliente;

    public Order(){

    }
    public Order(Date moment,OrderStatus orderStatus, Cliente cliente) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.cliente = cliente;
    }

    public void addItem(OrderItem orderItem) {
        itens.add(orderItem);
    }
     public void removeItem(OrderItem orderItem){
        itens.remove(orderItem);
     }
     public double total(){
        double soma = 0;
        for (OrderItem c : itens) {
            soma += c.subTotal();
        }
        return soma;
     }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
