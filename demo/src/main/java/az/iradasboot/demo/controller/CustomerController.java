//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.CustomerResponseDto;
//import az.iradasboot.demo.service.CustomerService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/v10/customer")
//public class CustomerController {
//    private final CustomerService customerService;
//
//    @GetMapping("/{id}")
//    public CustomerResponseDto getCustomer(@PathVariable Long id){
//        return customerService.getCustomer(id);
//    }
//}
