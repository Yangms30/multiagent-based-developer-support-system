package multiagentbaseddevelopersupportsystem.domain;

import multiagentbaseddevelopersupportsystem.PostApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;


@Entity
@Table(name="Post_table")
@Data

//<<< DDD / Aggregate Root
public class Post  {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
private Long postId;    
    
    
private String title;    
    
    
private String content;    
    
    
private Integer viewCount;    
    
    
private Date createdAt;    
    
    
private Date updatedAt;    
    
    
private Long userId;


    public static PostRepository repository(){
        PostRepository postRepository = PostApplication.applicationContext.getBean(PostRepository.class);
        return postRepository;
    }



//<<< Clean Arch / Port Method
    public void savePost(SavePostCommand savePostCommand){
        
        //implement business logic here:
        

        multiagentbaseddevelopersupportsystem.external.PostQuery postQuery = new multiagentbaseddevelopersupportsystem.external.PostQuery();
        // postQuery.set??()        
          = PostApplication.applicationContext
            .getBean(multiagentbaseddevelopersupportsystem.external.Service.class)
            .post(postQuery);

    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void deletePost(){
        
        //implement business logic here:
        


        PostDeleted postDeleted = new PostDeleted(this);
        postDeleted.publishAfterCommit();
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void startPostWriting(){
        
        //implement business logic here:
        


    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void increaseViewCount(){
        
        //implement business logic here:
        


    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void editPost(EditPostCommand editPostCommand){
        
        //implement business logic here:
        


    }
//>>> Clean Arch / Port Method

//<<< Clean Arch / Port Method
    public static void createProject(ProjectCreated projectCreated){
        
        //implement business logic here:
        
        /** Example 1:  new item 
        Post post = new Post();
        repository().save(post);

        */

        /** Example 2:  finding and process
        

        repository().findById(projectCreated.get???()).ifPresent(post->{
            
            post // do something
            repository().save(post);


         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
