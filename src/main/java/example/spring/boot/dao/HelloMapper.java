package example.spring.boot.dao;

import example.spring.boot.model.Hello;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by liuluming on 2017/2/14.
 */
@Mapper
@CacheConfig(cacheNames="hello")
public interface HelloMapper {

    @Cacheable
    List<Hello> findByName(@Param("name") String name);

    int insert(@Param("name") String name);

    @Update("update user set name=#{name}, date_modify=now() where id=#{id}")
    int update(@Param("name") String name, @Param("id") Long id);
}

