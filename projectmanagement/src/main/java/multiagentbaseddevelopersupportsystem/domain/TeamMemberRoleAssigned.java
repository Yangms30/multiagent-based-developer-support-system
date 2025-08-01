package multiagentbaseddevelopersupportsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import multiagentbaseddevelopersupportsystem.domain.*;
import multiagentbaseddevelopersupportsystem.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TeamMemberRoleAssigned extends AbstractEvent {

    private Long projectId;
    private Long memberId;
    private String memberEmail;
    private TeamRole role;

    public TeamMemberRoleAssigned(ProjectManagement aggregate) {
        super(aggregate);
    }

    public TeamMemberRoleAssigned() {
        super();
    }
}
//>>> DDD / Domain Event
