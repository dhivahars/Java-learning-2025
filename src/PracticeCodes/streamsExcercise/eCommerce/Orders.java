package PracticeCodes.streamsExcercise.eCommerce;
enum Status{COMPLETED,PENDING,CANCELLED;}
public class Orders {
    private int orderId;
    private String customerName;
    private Status orderStatus;
    private int amount;

    public Orders(int orderId, String customerName, Status orderStatus, int amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderStatus = orderStatus;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public  Status getOrder_status() {
        return orderStatus;
    }

    public void setOrder_status(Status order_status) {
        this.orderStatus = order_status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\nOrder Id=" + orderId +
                "\nCustomer Name='" + customerName +
                "\nOrder_status=" + orderStatus +
                "\nAmount=" + amount ;
    }
}
