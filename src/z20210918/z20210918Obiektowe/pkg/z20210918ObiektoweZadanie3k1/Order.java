package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZadanie3k1;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
   private int counterOrderItemsCurrent;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        //inicjacja tablicy
        orderItems =new OrderItem[maxOrderItem];
        counterOrderItemsCurrent=0;
    }
    public boolean addItem(OrderItem item) {
        if (counterOrderItemsCurrent>=maxOrderItem) { //to sie nigdy nie wydarzy
            System.out.println("order is full");
            return false;
        }
        if (item.isCorrect()) {
            orderItems[counterOrderItemsCurrent]=item;
            counterOrderItemsCurrent++;
            return true;
        }
        System.out.println("niepoprawne"); //nie dotrze tu, jeżeli przejdzie prxez isCorrect
        //dlatego nie musi byc w ifie powyzej
        return false;
    }

    public double getTotalAmount() {
        double totalAmount=0;
        for (OrderItem itemi:orderItems) { //dodac validacje czy itemi nullem bo
            //moze byc mniej niż max
            if (itemi!=null){
                totalAmount+=itemi.getAmount();
            }
        }
        return totalAmount;
    }


    public double getItemsCount() { //laczna liczba zamowionych produktow
        double total=0;
        for (OrderItem itemi:orderItems) { //dodac validacje czy itemi nullem bo
            //moze byc mniej niż max
            if (itemi!=null){
                total+=itemi.getQuantity();
            }
        }
        return total;
    }

    public void print() {
        for (OrderItem item:orderItems) {
            if (item!=null){
                item.print(); //odnosi sie do printa z OrderItem
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }


/*
    c) metodę public boolean addItem(OrderItem orderItem), dodającą pozycję zamówienia,
    ale tylko wtedy, gdy w zamówieniu jest jeszcze miejsce i jeżeli pozycja zamówienia jest
            prawidłowa*/

    //-----------
}
