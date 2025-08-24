//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.GroupDto;
//import az.iradasboot.demo.mapper.GroupMapper;
//import az.iradasboot.demo.repository.GroupRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class GroupService {
//    private final GroupRepository repository;
//    private final GroupMapper groupMapper;
//
//    public List< GroupDto> getGroups(){
//       var entityList =  repository.getAllGroups();
//       return groupMapper.entityListToDto(entityList);
//
//    }
//    public GroupDto getGroup(Long id){
//        var entity = repository.getGroup(id).orElseThrow();
//        return groupMapper.entityToDto(entity);
//    }
//    public void addGroup(GroupDto dto){
//        repository.addGroup(dto.getName(), dto.getCapacity(), dto.getSector());
//    }
//    public void updateGroup(GroupDto dto, Long id){
//        repository.update(dto.getCapacity(), dto.getSector(),id);
//    }
//}
