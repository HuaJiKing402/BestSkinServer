package top.bianstudio.backend.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "options")
public class Options {
    private String site_url;
    private String site_name;
    private String site_description;
    private meta Meta;
    @Data
    private class meta{
        private String serverName;
        private String implementationName;
        private String implementationVersion;
        private Map<String,String> Links;
        private List<String> skinDomains;
        private String signaturePublickey;
    }
    @Data
    private class feature{
        private boolean non_email_login;
    }
}