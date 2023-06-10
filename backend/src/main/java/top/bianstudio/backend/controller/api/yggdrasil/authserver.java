package top.bianstudio.backend.controller.api.yggdrasil;

import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/yggdrasil/authserver")
public class authserver {

    //登录
    //使用密码进行身份验证，并分配一个新的令牌。
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String authenticate(@RequestBody JSONObject jsonParam) {

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);
        return result.toJSONString();
    }

    //刷新令牌
    //吊销原令牌，并颁发一个新的令牌。
    @RequestMapping(value = "/refresh", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String refresh(@RequestBody JSONObject jsonParam) {

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);
        return result.toJSONString();
    }

    //验证令牌
    //检验令牌是否有效。
    @RequestMapping(value = "/validate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String validate(@RequestBody JSONObject jsonParam) {

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);
        return result.toJSONString();
    }

    //吊销令牌
    //吊销给定令牌。
    @RequestMapping(value = "/invalidate", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String invalidate(@RequestBody JSONObject jsonParam) {

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);
        return result.toJSONString();
    }

    //登出
    //吊销用户的所有令牌。
    @RequestMapping(value = "/signout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String signout(@RequestBody JSONObject jsonParam) {

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", jsonParam);
        return result.toJSONString();
    }
}
