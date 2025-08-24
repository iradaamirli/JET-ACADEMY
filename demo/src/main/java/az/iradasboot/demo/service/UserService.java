//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.UserDto;
//import az.iradasboot.demo.dto.UserResponse;
//import az.iradasboot.demo.entity.UserEntity;
//import az.iradasboot.demo.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class UserService {
//
//    private final UserRepository userRepository;
//
//    public UserResponse addUser(UserDto dto){
//        UserEntity user = new UserEntity(dto.getName(),dto.getSurname(),dto.getFavorityCategory());
//        userRepository.save(user);
//        return new UserResponse("User ugurla elave olundu");
//    }
//
//
//
//}
