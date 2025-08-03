package multiagentbaseddevelopersupportsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import multiagentbaseddevelopersupportsystem.InviteApplication;

@Entity
@Table(name = "Invite_table")
@Data
//<<< DDD / Aggregate Root
public class Invite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userid;

    private String email;

    public static InviteRepository repository() {
        InviteRepository inviteRepository = InviteApplication.applicationContext.getBean(
            InviteRepository.class
        );
        return inviteRepository;
    }
}
//>>> DDD / Aggregate Root
