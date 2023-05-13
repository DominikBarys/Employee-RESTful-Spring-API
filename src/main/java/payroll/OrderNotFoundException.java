package payroll;

public class OrderNotFoundException extends RuntimeException{

    OrderNotFoundException(Long id){
        super("Order of id " + id + " was not found");
    }

}
