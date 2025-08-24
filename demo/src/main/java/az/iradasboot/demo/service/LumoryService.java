//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.LumoryDto;
//import az.iradasboot.demo.entity.LumoryEntity;
//import az.iradasboot.demo.repository.LumoryRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class LumoryService {
//    private final LumoryRepository repository;
//
//    public List<LumoryEntity> getProducts(){
//        return lumoryRepository.findAll();
//    }
//    public LumoryEntity entity(LumoryDto dto){
//        var entity = new LumoryEntity(dto.getFname(), dto.getLname(), dto.getOrders(),dto.getSize(),dto.getColors());
//        return repository.save(entity);
//    }
//
//    public LumoryEntity updateProducts(Long id, LumoryDto dto){
//    var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Coming Soon"));
//    entity.setFname(dto.getFname());
//    entity.setLname(dto.getLname());
//    entity.setOrders(dto.getOrders());
//    entity.setSize(dto.getSize());
//    entity.setColors(dto.getColors());
//    return repository.save(entity);
//    }
//    public void  deleteProducts(Long id){
//        repository.deleteById(id);
//    }
//    public List<LumoryEntity> getByFname(String name){
//        return repository.getByFname(name);
//
//    }
//}
