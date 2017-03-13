package example.spring.boot.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuluming on 2017/2/10.
 */
@Controller
@RequestMapping("/hello")
@Api(value = "用户管理",description = "描述")
public class HelloController {

    @ApiOperation(value="查询列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public String list(){
        return "Hello There!";
    }

    @ApiOperation(value="首页")
    @RequestMapping(value = {"/index",""},method = RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("host", "http://www.luming.com");
        return "index";
    }
}
