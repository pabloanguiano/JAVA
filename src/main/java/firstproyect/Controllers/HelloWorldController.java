package firstproyect.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping({"/hello", "/hola"})
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/value/{values}")
    public String params(@PathVariable String values){
        return values;
    }

    /**
     * java doc
     * @param value
     * @return
     */
    @GetMapping("/validate/{value}")
    public String compare_string(@PathVariable String value){
        final String returns;
         if(new StringBuilder(value).reverse().toString().compareTo(value) == 0){
             return "TRUE";
         } else {
             return "false";
         }

    }

}
