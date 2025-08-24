//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.UserDto;
//import az.iradasboot.demo.dto.UserResponse;
//import az.iradasboot.demo.entity.UserEntity;
//import az.iradasboot.demo.service.UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RequestMapping("/api/v1/user")
//@RestController
//@RequiredArgsConstructor
//public class UserController {
//    private final UserService userService;
//
//    @PostMapping("add")
//    public UserResponse addUser ( @RequestBody UserDto userEntity){
//        return userService.addUser(userEntity);
//    }
//
//}
