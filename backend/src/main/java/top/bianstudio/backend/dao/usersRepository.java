package top.bianstudio.backend.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import top.bianstudio.backend.pojo.UserEntity;

public interface usersRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByNickname(String Nickname);
    UserEntity findByEmail(String Email);

}