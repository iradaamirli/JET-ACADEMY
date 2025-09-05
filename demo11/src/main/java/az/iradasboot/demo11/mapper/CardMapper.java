//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.CardDto;
//import az.iradasboot.demo11.dto.UsersDto;
//import az.iradasboot.demo11.entity.CardEntity;
//import az.iradasboot.demo11.entity.UsersEntity;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class CardMapper {
//    public CardDto entityToDto(CardEntity c) {
//        return new CardDto(c.getCardNumber() );
//    }
//    public List<CardDto> entityListToDtoList(List<CardEntity> entityList){
//        List<CardDto> dtoList = new ArrayList<>();
//        for(CardEntity c : entityList){
//            dtoList.add(entityToDto(c));
//        }
//        return dtoList;
//    }
//
//    public List<UsersDto> entitytoDtoList(List<UsersEntity> usersEntities){
//        List<UsersDto> dtosOne = new ArrayList<>();
//
//        for(UsersEntity e : usersEntities){
//            List<CardDto> cardDtosTwo = new ArrayList<>();
//            for(CardEntity c : e.getCards()){
//                var card = CardDto.builder().cardNumber(c.getCardNumber()).build();
//                cardDtosTwo.add(card);
//            }
//
//            var entity = UsersDto.builder().name(e.getName()).surname(e.getSurname()).age(e.getAge()).cardList(cardDtosTwo).build();
//            dtosOne.add(entity);
//        }
//
//        return dtosOne;
//
//
//    }
//}
