//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.LumoryDto;
//import az.iradasboot.demo.entity.LumoryEntity;
//import az.iradasboot.demo.service.LumoryService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/v5/product")
//public class LumoryController {
//    private final LumoryService lumoryService;
//
//    @GetMapping("/get")
//    public List<LumoryEntity> getProducts(){
//        return lumoryService.getProducts();
//    }
//    @PostMapping("/add")
//    public LumoryEntity addProduct(@RequestBody LumoryDto dto){
//        return lumoryService.entity(dto);
//
//    }
//
//    @PatchMapping("/update/{id}")
//    public LumoryEntity updateProducts(@PathVariable("id") Long id, @RequestBody LumoryDto dto){
//        return lumoryService.updateProducts(id,dto);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete (@PathVariable Long id){
//         lumoryService.deleteProducts(id);
//
//    }
//    @GetMapping("/search")
//    public List<LumoryEntity> getByFname (@RequestParam ("name") String name) {
//        return lumoryService.getByFname(name);
//    }
//}
