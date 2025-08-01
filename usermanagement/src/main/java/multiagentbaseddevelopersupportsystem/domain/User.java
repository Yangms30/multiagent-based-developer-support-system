package multiagentbaseddevelopersupportsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import multiagentbaseddevelopersupportsystem.UsermanagementApplication;

@Entity
@Table(name = "User_table")
@Data
//<<< DDD / Aggregate Root
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    private String email;

    private String password;

    private String name;

    private String profileImage;

    private String position;

    private String role;

    private Long projectId;

    private String status;

    public static UserRepository repository() {
        UserRepository userRepository = UsermanagementApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }

    //<<< Clean Arch / Port Method
    public void signup(SignupCommand signupCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void login(LoginCommand loginCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void acceptProjectInvitation(
        AcceptProjectInvitationCommand acceptProjectInvitationCommand
    ) {
        //implement business logic here:

        ProjectInvitationAccepted projectInvitationAccepted = new ProjectInvitationAccepted(
            this
        );
        projectInvitationAccepted.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void invitedProject(MemberIdInvited memberIdInvited) {
        //implement business logic here:

        /** Example 1:  new item 
        User user = new User();
        repository().save(user);

        */

        /** Example 2:  finding and process
        

        repository().findById(memberIdInvited.get???()).ifPresent(user->{
            
            user // do something
            repository().save(user);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
