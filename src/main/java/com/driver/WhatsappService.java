package com.driver;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository WhatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception{
        return WhatsappRepository.createUser(name,mobile);
    }
    public Group createGroup(List<User> users){
        return WhatsappRepository.createGroup(users);
    }
    public int createMessage(String content){
        return WhatsappRepository.createMessage(content);
    }
    public int sendMessage(Message message , User Sender , Group group) throws Exception{
        return WhatsappRepository.sendMessage(message,Sender,group);
    }
    public String changeAdmin(User approver , User user, Group group) throws  Exception{
        return WhatsappRepository.changeAdmin(approver,user,group);
    }
    public int removeUser(User user) throws  Exception{
        return WhatsappRepository.removeUser(user);
    }
    public String findMessage(Date start , Date end , int K) throws Exception{
        return WhatsappRepository.findMessage(start,end,K);
    }
}
