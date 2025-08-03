package multiagentbaseddevelopersupportsystem.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import multiagentbaseddevelopersupportsystem.config.kafka.KafkaProcessor;
import multiagentbaseddevelopersupportsystem.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    UserRepository userRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MemberIdInvited'"
    )
    public void wheneverMemberIdInvited_InvitedProject(
        @Payload MemberIdInvited memberIdInvited
    ) {
        MemberIdInvited event = memberIdInvited;
        System.out.println(
            "\n\n##### listener InvitedProject : " + memberIdInvited + "\n\n"
        );

        // Sample Logic //
        User.invitedProject(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
