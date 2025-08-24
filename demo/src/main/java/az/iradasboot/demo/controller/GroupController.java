//package az.iradasboot.demo.controller;
//
//import az.iradasboot.demo.dto.GroupDto;
//import az.iradasboot.demo.service.GroupService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v7/groups")
//@RequiredArgsConstructor
//public class GroupController {
//    private  final GroupService groupService;
//
//
//    @GetMapping("/get")
//    public List<GroupDto> getGroupList(){
//        return groupService.getGroups();
//    }
//    @GetMapping("{id}")
//    public GroupDto getGroup(@PathVariable Long id){
//        return groupService.getGroup(id);
//    }
//    @PostMapping("/add")
//    public void addGroup(@RequestBody GroupDto dto){
//        groupService.addGroup(dto);
//
//    }
//
//    @PatchMapping ("{id}")
//    public void update(@RequestBody GroupDto dto, @PathVariable Long id){
//        groupService.updateGroup(dto, id);
//    }
//}
