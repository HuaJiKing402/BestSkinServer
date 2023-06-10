package top.bianstudio.backend.model.yggdrasil;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.List;

/** Yggdrasil-Meta */
@Data
@Component
@ConfigurationProperties(prefix = "bestskinserver.yggdrasil")
public class YggdrasilMeta {
    /** 服务端的元数据，内容任意 */
    private Meta meta;
    /** 用于验证数字签名的公钥 */
    private String signaturePublickey;
    /** 材质域名白名单 */
    private List<String> skinDomains;

    @Data
    @Component
    public class Meta {
        /** 服务器名称 */
        private String serverName;
        /** 服务端实现的名称 */
        private String implementationName;
        /** 服务端实现的版本 */
        private String implementationVersion;
        /** 是否支持使用邮箱之外的凭证登录（如角色名登录），默认为 false */
        @JsonProperty("feature.non_email_login")
        private boolean featureNonEmailLogin;
        /** 服务端相关链接 */
        private Links links;
        @Data
        @Component
        public class Links {
            /** 服务器首页地址 */
            private String homepage;
            /** 注册页面地址 */
            private String register;
        }
    }
}
