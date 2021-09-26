package top.mumudm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author mumu
 * @date 2021-9-26 14:07
 */
@RestController
public class RCloneController {


    @GetMapping("rclone")
    public void redirect(Map param){
        System.out.println(param);
    }
}
