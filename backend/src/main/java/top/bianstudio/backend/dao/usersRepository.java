package top.bianstudio.backend.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import top.bianstudio.backend.pojo.UserEntity;

public interface usersRepository extends CrudRepository<UserEntity, Integer> {
    public UserEntity findByNickname(String Nickname);
    public UserEntity findByEmail(String Email);

}