package multiagentbaseddevelopersupportsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import multiagentbaseddevelopersupportsystem.domain.*;
import multiagentbaseddevelopersupportsystem.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MemberIdInvited extends AbstractEvent {

    private Long projectId;
    private Long memberId;
    private TeamRole role;
    private String invitationToken;
    private String projectName;
    private String projectDescription;
    private List<Attachment> attachments;
    private InviteStatus inviteStatus;

    public MemberIdInvited(ProjectManagement aggregate) {
        super(aggregate);
    }

    public MemberIdInvited() {
        super();
    }
}
//>>> DDD / Domain Event
