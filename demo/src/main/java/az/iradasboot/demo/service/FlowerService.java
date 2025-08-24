//package az.iradasboot.demo.service;
//
//import az.iradasboot.demo.dto.FlowerDto;
//import az.iradasboot.demo.mapper.FlowerMapper;
//import az.iradasboot.demo.repository.FlowerRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class FlowerService {
//    private final FlowerRepository flowerRepository;
//    private  final FlowerMapper flowerMapper;
//
//    public List<FlowerDto> getFlowers(){
//        var entityList = flowerRepository.getAllFlowers();
//        return flowerMapper.entityListToDto(entityList);
//    }
//    public FlowerDto getFlower(Long id){
//        var entity = flowerRepository.getFlower(id);
//        return flowerMapper.entityToDto(entity);
//    }
//    public void addFlower(FlowerDto dto){
//        flowerRepository.addFlower(dto.getName(), dto.getPrice(), dto.getType(),dto.getColor());
//    }
//    public void updateFlower(FlowerDto dto, Long id){
//        flowerRepository.update(dto.getType(),dto.getColor(),id);
//    }
//}
//
