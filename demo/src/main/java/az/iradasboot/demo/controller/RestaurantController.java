//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.RestaurantResponseDto;
//import az.iradasboot.demo.service.RestaurantService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/v9/restaurant")
//public class RestaurantController {
//
//    private final RestaurantService restaurantService;
//    @GetMapping("/{id}")
//    public RestaurantResponseDto getRestaurant(@PathVariable Long id){
//        return restaurantService.getRestaurant(id);
//    }
//}
