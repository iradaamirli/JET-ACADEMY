//package az.iradasboot.demo11.mapper;
//
//import az.iradasboot.demo11.dto.CompanyDto;
//import az.iradasboot.demo11.dto.ProjectDto;
//import az.iradasboot.demo11.entity.CompanyEntity;
//import az.iradasboot.demo11.entity.ProjectEntity;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class ProjectMapper {
//    public ProjectDto entityToDto(ProjectEntity p){
//        return new ProjectDto(p.getProjectName(),p.getDeadline());
//    }
//    public List<ProjectDto> entityListToDtoList(List<ProjectEntity> entityList){
//        List<ProjectDto> dtoList = new ArrayList<>();
//        for (ProjectEntity p : entityList){
//            dtoList.add(entityToDto(p));
//        }
//        return dtoList;
//    }
//    public List<CompanyDto> entityToDtoList(List<CompanyEntity> companyEntities){
//        List<CompanyDto> dtosOne = new ArrayList<>();
//
//        for (CompanyEntity c : companyEntities){
//            List<ProjectDto> projectDtoTwo = new ArrayList<>();
//            for (ProjectEntity p : c.getProject()){
//                var project = ProjectDto.builder()
//                        .projectName(p.getProjectName())
//                        .deadline(p.getDeadline())
//                        .build();
//                projectDtoTwo.add(project);
//            }
//
//            var entity = CompanyDto.builder()
//                    .companyName(c.getCompanyName())
//                    .sector(c.getSector())
//                    .projectList(projectDtoTwo)
//                    .build();
//            dtosOne.add(entity);
//        }
//        return dtosOne;
//    }
//
//}
