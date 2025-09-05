//package az.iradasboot.demo11.service;
//
//import az.iradasboot.demo11.dto.CategoryDto;
//import az.iradasboot.demo11.mapper.ProductMapper;
//import az.iradasboot.demo11.repository.CategoryRepository;
//import az.iradasboot.demo11.repository.ProductRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class CategoryService {
//    private final CategoryRepository categoryRepository;
//    private final ProductMapper productMapper;
//
//    public List<CategoryDto> getCategory(){
//        return productMapper.entityToDtoList(categoryRepository.findAll());
//    }
//}
