package io.javabrains.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sethu on 2021/07/21.
 */

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        for(Topic topic :topicRepository.findAll()){
            topics.add(topic);
        }
        return topics;
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void update(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void delete(String id) {
        topicRepository.delete(id);
    }

}
