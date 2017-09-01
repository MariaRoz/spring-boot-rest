package feedback.controllers;

import feedback.models.Business;
import feedback.services.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class BusinessController {
    @Autowired
    BusinessService businessService;


    @RequestMapping(method = GET, value = "/bus/{userId}")
    public Business loadById(@PathVariable Long busiessId) {
        return this.businessService.findById(busiessId);
    }

    @RequestMapping(method = GET, value = "/bus/all")
    public List<Business> loadAll() {
        return this.businessService.findAll();
    }

    @RequestMapping("/whoami")
    @PreAuthorize("hasRole('USER')")
    public Business business() {
        return (Business) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();


//    @RequestMapping("/")
//    String hello() {
//        return "hello world";
    }
}
