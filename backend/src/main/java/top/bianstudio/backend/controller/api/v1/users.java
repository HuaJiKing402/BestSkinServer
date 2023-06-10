package top.bianstudio.backend.controller.api.v1;

import jakarta.annotation.Nonnull;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.bianstudio.backend.model.Result;
import top.bianstudio.backend.pojo.UserEntity;
import top.bianstudio.backend.service.userService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@RestController
@RequestMapping(path="/api/v1/users")
public class users {
    @Autowired
    private top.bianstudio.backend.dao.usersRepository usersRepository;
    @Autowired
    private userService userService;
    @GetMapping
    public Result verifyUser(@Nonnull @RequestParam("email") String email,@Nonnull @RequestParam("password") String password) {
        UserEntity user = usersRepository.findByEmail(email);
        if (Objects.equals(user.getPassword(), password)) {
            return new Result(200,"",null);
        }
        return new Result();
    }
    @PostMapping(produces="application/json;charset=UTF-8")
    public @ResponseBody ResponseEntity<Result> addNewUser (@RequestBody JSONObject Request) {
        userService.registeredUser(
                (String) Request.get("nickname"),
                (String) Request.get("password"),
                (String) Request.get("email"),
                (String) Request.get("qq_id")
        );
        return ResponseEntity.ok().body(new Result());
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers() {
        // This returns a JSON or XML with the users
        return usersRepository.findAll();
    }
}