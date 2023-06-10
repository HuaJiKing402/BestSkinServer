package top.bianstudio.backend.pojo;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "bestskinserver")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "uid")
    private Long uid;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "qq_id")
    private String qqId;
    @Basic
    @Column(name = "score")
    private int score;
    @Basic
    @Column(name = "permission")
    private int permission;
    @Basic
    @Column(name = "register_at")
    private Timestamp registerAt;
    @Basic
    @Column(name = "last_sign_at")
    private Timestamp lastSignAt;

    public Long getUid() {
        return uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQQId() {
        return qqId;
    }

    public void setQQId(String qqId) {
        this.qqId = qqId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public Timestamp getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Timestamp registerAt) {
        this.registerAt = registerAt;
    }

    public Timestamp getLastSignAt() {
        return lastSignAt;
    }

    public void setLastSignAt(Timestamp lastSignAt) {
        this.lastSignAt = lastSignAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return score == that.score && permission == that.permission && Objects.equals(uid, that.uid) && Objects.equals(nickname, that.nickname) && Objects.equals(password, that.password) && Objects.equals(email, that.email) && Objects.equals(qqId, that.qqId) && Objects.equals(registerAt, that.registerAt) && Objects.equals(lastSignAt, that.lastSignAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, nickname, password, email, qqId, score, permission, registerAt, lastSignAt);
    }
}
