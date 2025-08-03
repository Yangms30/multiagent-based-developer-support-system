package multiagentbaseddevelopersupportsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import multiagentbaseddevelopersupportsystem.AttachmentApplication;

@Entity
@Table(name = "Attachment_table")
@Data
//<<< DDD / Aggregate Root
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fileId;

    private Long postId;

    private String originalName;

    private String storedName;

    private String fileUrl;

    private String fileSize;

    private String fileType;

    private Date createdAt;

    public static AttachmentRepository repository() {
        AttachmentRepository attachmentRepository = AttachmentApplication.applicationContext.getBean(
            AttachmentRepository.class
        );
        return attachmentRepository;
    }
}
//>>> DDD / Aggregate Root
