package multiagentbaseddevelopersupportsystem.domain;

import multiagentbaseddevelopersupportsystem.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "projectManagements",
    path = "projectManagements"
)
public interface ProjectManagementRepository
    extends PagingAndSortingRepository<ProjectManagement, Long> {}
