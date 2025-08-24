//package az.iradasboot.demo.mapper;
//
//import az.iradasboot.demo.dto.FlowerDto;
//import az.iradasboot.demo.entity.FlowerEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class FlowerMapper {
//    public List<FlowerDto> entityListToDto(List<FlowerEntity> entities){
//        List<FlowerDto> dtoList = new ArrayList<>();
//        for (FlowerEntity e : entities){
//            dtoList.add(new FlowerDto(e.getName(),e.getPrice(), e.getType(), e.getColor()));
//        }
//        return dtoList;
//    }
//    public FlowerDto entityToDto(FlowerEntity e){
//        return  new FlowerDto(e.getName(),e.getPrice(),e.getType(),e.getColor());
//    }
//}
