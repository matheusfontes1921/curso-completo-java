import java.util.Date;

public final class UsedProduct extends Produto {
    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final Double priceTag(){
        return getPrice();
    }
}
