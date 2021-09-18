package z20210918.z20210918Obiektowe.pkg.z20210918ObiektoweZadanie3k1;

public class OrderMain {
    public static void main(String[] args) {
        OrderItem item1=new OrderItem("Cukier", 3.5,1);
        OrderItem item2=new OrderItem("Mąka", 8,2);
        OrderItem item3=new OrderItem("Chleb", 12,3);
        OrderItem item4=new OrderItem("zły chleb", 12,-3);

        Order order=new Order(12);
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        order.addItem(item4);

        order.print();

/*        if (item1.isCorrect() ==true) {
            item1.print();
        } else {
            System.out.println("niepoprawne dane");
        }*/ //od 1 podpunktu
    }
}
