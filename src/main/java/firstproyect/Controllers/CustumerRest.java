package firstproyect.Controllers;

import firstproyect.modeldomain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustumerRest {

    private List<Customer> clients = new ArrayList<>(Arrays.asList(
            new Customer(1, "pablo", "pablo", "123"),
            new Customer(2, "pablo2", "pablo2", "123")
    ));

    @GetMapping("/list")
    public List<Customer> getClients_method() {
        return clients;
    }
}
