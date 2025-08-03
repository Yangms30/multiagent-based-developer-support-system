package multiagentbaseddevelopersupportsystem.domain;

import java.util.*;
import lombok.*;
import multiagentbaseddevelopersupportsystem.domain.*;
import multiagentbaseddevelopersupportsystem.infra.AbstractEvent;

@Data
@ToString
public class MemberIdInvited extends AbstractEvent {

    private Long projectId;
    private Long memberId;
}
