package top.bianstudio.backend.controller.api.yggdrasil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.bianstudio.backend.model.yggdrasil.YggdrasilMeta;
import top.bianstudio.backend.pojo.Options;

@RestController
@RequestMapping("/api/yggdrasil")
public class metaController {
    @Autowired
    private YggdrasilMeta yggdrasilMeta;

    @GetMapping
    public YggdrasilMeta getMeta(){
        return yggdrasilMeta;
    }
}
