package az.iradasboot.demo.mapper;

import az.iradasboot.demo.dto.OrderssDto;
import az.iradasboot.demo.entity.OrderssEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class OrdersMapper {
    public OrderssDto entityToDto(OrderssEntity o){
        return new OrderssDto(o.getId() , o.getProduct());
    }

    public List<OrderssDto> entityListToDtoList(List<OrderssEntity> entityList){
        List<OrderssDto> dtoList = new ArrayList<>();
        for(OrderssEntity o: entityList){
            dtoList.add(entityToDto(o));
        }
        return dtoList;
    }
}
