//package az.iradasboot.demo.mapper;
//
//import az.iradasboot.demo.dto.GroupDto;
//import az.iradasboot.demo.entity.GroupEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class GroupMapper {
//   public List<GroupDto> entityListToDto(List<GroupEntity> entities){
//        List<GroupDto> dtoList = new ArrayList<>();
//        for (GroupEntity e: entities){
//            dtoList.add(new GroupDto(e.getName(),e.getCapacity(),e.getSector()));
//
//        }
//        return dtoList;
//    }
//public GroupDto entityToDto(GroupEntity e){
//       return new GroupDto(e.getName(),e.getCapacity(),e.getSector());
//}
//}
