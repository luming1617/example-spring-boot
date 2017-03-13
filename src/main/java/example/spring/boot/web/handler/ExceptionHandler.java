package example.spring.boot.web.handler;

import example.spring.boot.exception.BusinessException;
import example.spring.boot.web.response.GeneralResponse;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liuluming on 2017/2/13.
 */
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public GeneralResponse<String> errorHandler1(HttpServletRequest req, BusinessException e) throws Exception {
        GeneralResponse<String> r = new GeneralResponse<>();
       r.setSuccessful(false);
       r.setMessage(e.getMessage());
        return r;
    }


    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    @ResponseBody
    public GeneralResponse<String> errorHandler2(HttpServletRequest req, BusinessException e) throws Exception {
        GeneralResponse<String> r = new GeneralResponse<>();
        r.setSuccessful(false);
        r.setMessage("系统出错了："+e.getMessage());
        return r;
    }
}
