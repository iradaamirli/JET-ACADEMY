//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.FlowerDto;
//import az.iradasboot.demo.service.FlowerService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v8/flowers")
//@RequiredArgsConstructor
//public class FlowerController {
//    private final FlowerService flowerService;
//
//    @GetMapping("/get")
//    public List<FlowerDto> getFlowerList(){
//        return flowerService.getFlowers();
//    }
//    @GetMapping("{id}")
//    public FlowerDto getFlower(@PathVariable Long id){
//        return flowerService.getFlower(id);
//    }
//    @PostMapping("/add")
//    public void addFlower(@RequestBody FlowerDto dto){
//        flowerService.addFlower(dto);
//    }
//    @PatchMapping("{id}")
//    public void update(@RequestBody FlowerDto dto, @PathVariable Long id){
//        flowerService.updateFlower(dto,id);
//    }
//}
