import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Visit v = new Visit("Giuliano", new Date());

        v.getCustomer().setMember(true);
        v.getCustomer().setMemberType("Premium");

        v.setServiceExpense(4000.69);
        v.setProductExpense(67.67);

        System.out.println(v);
    }
}