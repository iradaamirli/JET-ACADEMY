//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.DoctorDto;
//import az.iradasboot.demo11.dto.PatientDto;
//import az.iradasboot.demo11.entity.DoctorEntity;
//import az.iradasboot.demo11.entity.PatientEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Component
//public class DoctorMapper {
//    public PatientDto patientEntityToDto (PatientEntity patientEntity){
//        return PatientDto.builder()
//                .fname(patientEntity.getFname())
//                .lname(patientEntity.getLname())
//                .dob(patientEntity.getDob())
//                .build();
//    }
//    public Set<PatientDto> patientSetToDtoSet (Set<PatientEntity> patients){
//        Set<PatientDto> dtoSet = new HashSet<>();
//        for (PatientEntity p : patients){
//            dtoSet.add(patientEntityToDto(p));
//        }
//        return dtoSet;
//    }
//    public DoctorDto doctorEntityToDto (DoctorEntity doctorEntity){
//        return DoctorDto.builder()
//                .name(doctorEntity.getName())
//                .surname(doctorEntity.getSurname())
//                .patients(patientSetToDtoSet(doctorEntity.getPatients()))
//                .build();
//    }
//    public List<DoctorDto> doctorEntityListToDtoList(List<DoctorEntity> doctors){
//        List<DoctorDto> dtoList = new ArrayList<>();
//        for (DoctorEntity d : doctors){
//            dtoList.add(doctorEntityToDto(d));
//        }
//        return dtoList;
//    }
//}
