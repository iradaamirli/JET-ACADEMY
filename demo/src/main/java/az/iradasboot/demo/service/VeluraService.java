//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.VeluraDto;
//import az.iradasboot.demo.entity.VeluraEntity;
//import az.iradasboot.demo.repository.VeluraRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class VeluraService {
//    private final VeluraRepository repository;
//    public List<VeluraEntity> getProducts(){
//        return repository.findAll();
//    }
//public VeluraEntity entity(VeluraDto dto){
//        var entity = new VeluraEntity(dto.getFname(), dto.getLname(), dto.getQuality(), dto.getExpireTime(),dto.getProducts() );
//        return repository.save(entity);
//
//
//}
//public VeluraEntity updateProducts(Long id,VeluraDto dto){
//    var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Coming Soon"));
//    entity.setFname(dto.getFname());
//    entity.setLname(dto.getLname());
//    entity.setProducts(dto.getProducts());
//    entity.setQuality(dto.getQuality());
//    entity.setExpireTime(dto.getExpireTime());
//        return repository.save(entity);
//}
//    public void  deleteProducts(Long id){
//        repository.deleteById(id);
//    }
//    public List<VeluraEntity> getByFname(String name){
//        return repository.getByFname(name);
//
//    }
//}
