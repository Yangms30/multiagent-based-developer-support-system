package multiagentbaseddevelopersupportsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import multiagentbaseddevelopersupportsystem.domain.*;
import multiagentbaseddevelopersupportsystem.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProjectInvitationAccepted extends AbstractEvent {

    private Long userId;
    private String email;
    private String password;
    private String name;
    private String position;
    private String role;
    private Long projectId;

    public ProjectInvitationAccepted(User aggregate) {
        super(aggregate);
    }

    public ProjectInvitationAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
