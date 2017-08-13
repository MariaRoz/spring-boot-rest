package feedback.controllers;

import feedback.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessController {
    @Autowired
    BusinessService businessService;

//    @RequestMapping(value = "/business/", method = RequestMethod.GET)
//    public ResponseEntity<List<Business>> listAllUsers() {
//        List<Business> businesses = businessService.getAll()  ;
//        if (businesses.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//            // You many decide to return HttpStatus.NOT_FOUND
//        }
//        return new ResponseEntity<List<Business>>(businesses, HttpStatus.OK);
//    }


    @RequestMapping("/")
    String hello() {
        return "hello world";
    }
}
