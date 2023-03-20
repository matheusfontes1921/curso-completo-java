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

    }
     public void removeItem(OrderItem orderItem){

     }
     public double total(){
        return 10.0;
     }


}
