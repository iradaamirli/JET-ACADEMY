//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.CategoryDto;
//import az.iradasboot.demo11.dto.ProductDto;
//import az.iradasboot.demo11.entity.CategoryEntity;
//import az.iradasboot.demo11.entity.ProductEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class ProductMapper {
//    public ProductDto entityToDto(ProductEntity p){
//        return new ProductDto(p.getName(), p.getPrice());
//    }
//    public List<ProductDto> entityListToDtoList(List<ProductEntity> entityList){
//        List<ProductDto> dtoList = new ArrayList<>();
//        for (ProductEntity p : entityList){
//        dtoList.add(entityToDto(p));
//        }
//        return dtoList;
//
//    }
//    public List<CategoryDto> entityToDtoList(List<CategoryEntity> categoryEntities){
//        List<CategoryDto> dtosOne = new ArrayList<>();
//        for (CategoryEntity c :categoryEntities){
//            List<ProductDto> productDtoTwo = new ArrayList<>();
//            for (ProductEntity p : c.getProduct()){
//                var product = ProductDto.builder()
//                        .name(p.getName())
//                        .price(p.getPrice())
//                        .build();
//
//                dtosOne.add(entityToDtoList(p))
//
//            }
//
//            var entity = CategoryDto.builder()
//                    .name(c.getName())
//                    .productList(productDtoTwo)
//                    .build();
//        }
//        return dtosOne;
//    }
//}
