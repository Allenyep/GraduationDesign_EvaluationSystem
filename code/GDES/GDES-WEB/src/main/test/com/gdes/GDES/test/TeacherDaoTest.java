package com.gdes.GDES.test;

import com.gdes.GDES.dao.TeacherDao;
import com.gdes.GDES.model.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class TeacherDaoTest {
    @Resource
    private TeacherDao teacherDao;

    @Test
    public void testGetTeacherById() {
        Teacher teacher = teacherDao.getTeacherById("5210");
        System.out.println(teacher.getName_t());
    }
}
