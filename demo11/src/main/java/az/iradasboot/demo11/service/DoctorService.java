//package az.iradasboot.demo11.service;
//
//import az.iradasboot.demo11.dto.DoctorDto;
//import az.iradasboot.demo11.mapper.DoctorMapper;
//import az.iradasboot.demo11.repository.DoctorRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class DoctorService {
//    private final DoctorRepository doctorRepository;
//    private final DoctorMapper doctorMapper;
//
//    public List<DoctorDto> getDoctors(){
//        return doctorMapper.doctorEntityListToDtoList(doctorRepository.findAll());
//    }
//}
