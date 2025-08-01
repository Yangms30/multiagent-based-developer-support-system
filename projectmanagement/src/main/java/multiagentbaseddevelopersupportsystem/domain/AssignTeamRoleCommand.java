package multiagentbaseddevelopersupportsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AssignTeamRoleCommand {

    private Long projectId;
    private Long memberId;
    private String memberEmail;
    private TeamRole role;
}
