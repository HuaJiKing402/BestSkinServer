package top.bianstudio.backend.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
@Data
public class GitInfo {
    private String buildtime;
    @Value("${git.build.version}")
    private String version;
    @Value("${git.commit.id.abbrev}")
    private String id_abbrev;
    @Value("${git.commit.id.full}")
    private String id_full;
}