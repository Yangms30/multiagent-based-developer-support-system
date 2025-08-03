package multiagentbaseddevelopersupportsystem.domain;

import java.util.*;
import lombok.*;
import multiagentbaseddevelopersupportsystem.domain.*;
import multiagentbaseddevelopersupportsystem.infra.AbstractEvent;

@Data
@ToString
public class ProjectCreated extends AbstractEvent {

    private Long projectId;
    private String projectName;
    private String projectDescription;
    private Object projectStatus;
}
