package example.spring.boot.service;

import example.spring.boot.dao.HelloMapper;
import example.spring.boot.exception.BusinessException;
import example.spring.boot.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by liuluming on 2017/2/17.
 */
@Service
public class HelloService {

    @Autowired
    private HelloMapper helloMapper;

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public int insert(String name) throws BusinessException {
        int i= helloMapper.insert(name);
        System.out.println("数量="+i);
        throw new BusinessException(null,"测试异常");
    }

    public int update(String name,Long id){
        return helloMapper.update(name,id);
    }

    public List<Hello> findByName(String name){
        return helloMapper.findByName(name);
    }
}
