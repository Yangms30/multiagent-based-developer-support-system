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
    PostRepository postRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ProjectCreated'"
    )
    public void wheneverProjectCreated_CreateProject(
        @Payload ProjectCreated projectCreated
    ) {
        ProjectCreated event = projectCreated;
        System.out.println(
            "\n\n##### listener CreateProject : " + projectCreated + "\n\n"
        );

        // Comments //
        //프로젝트 파일 게시판에 업로드

        // Sample Logic //
        Post.createProject(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
