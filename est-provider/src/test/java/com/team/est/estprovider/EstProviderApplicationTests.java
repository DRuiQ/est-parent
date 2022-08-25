package com.team.est.estprovider;

import com.team.est.entity.Classify;
import com.team.est.entity.ClassifyExample;
import com.team.est.mapper.ClassifyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstProviderApplicationTests {

    @Autowired(required = false)
    private ClassifyMapper classifyMapper;

    @Test
    public void contextLoads() {
        List<Classify> list=classifyMapper.selectByExample(new ClassifyExample());
        System.out.println("共有多少行:"+list.size());
    }




}
