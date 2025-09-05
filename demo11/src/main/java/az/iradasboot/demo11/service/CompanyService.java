//package az.iradasboot.demo11.service;
//
//import az.iradasboot.demo11.dto.CompanyDto;
//import az.iradasboot.demo11.mapper.ProjectMapper;
//import az.iradasboot.demo11.repository.CompanyRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class CompanyService {
//    private final CompanyRepository companyRepository;
//    private final ProjectMapper projectMapper;
//
//    public List<CompanyDto> getCompany(){
//        return projectMapper.entityToDtoList(companyRepository.findAll());
//    }
//}
