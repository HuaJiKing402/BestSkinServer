package top.bianstudio.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.bianstudio.backend.pojo.UserEntity;
import top.bianstudio.backend.dao.usersRepository;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class userService {
    @Autowired
    private usersRepository usersRepository;

    public void registeredUser(String nickname, String password, String email, String qqId){
        UserEntity new_user = new UserEntity();
        new_user.setNickname(nickname);
        new_user.setPassword(password);
        new_user.setEmail(email);
        new_user.setQQId(qqId);
        new_user.setScore(0);
        new_user.setPermission(0);
        new_user.setRegisterAt(new Timestamp(new Date().getTime()));
        new_user.setLastSignAt(new Timestamp(new Date().getTime()));
        usersRepository.save(new_user);
    }

    public UserEntity signUser(){
        return getByNickname("");
    }

    public boolean isExist(String nickname){
        UserEntity user = getByNickname(nickname);
        return null!=user;
    }
    public UserEntity getByNickname(String nickname) {
        return usersRepository.findByNickname(nickname);
    }
}
