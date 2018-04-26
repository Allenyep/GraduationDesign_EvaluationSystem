package com.gdes.GDES.test;

import com.gdes.GDES.model.Student;
import com.gdes.GDES.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Allen on 2018/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/applicationContext.xml")
public class ServiceTest {
    @Resource
    private StudentService studentService;

    @Test
    public void addTest() throws Exception {
        Student student=new Student();
//        student.setId(new Integer("1"));
        student.setName("王同学");
        student.setSex(false);
        student.setAddress("中国钓鱼岛");
        System.out.println(studentService.addStudent(student));
    }
    @Test
    public void deleteTest()throws Exception{
        System.out.println(studentService.deleteStudentById(1));

    }
    @Test
    public void updateTest()throws Exception{
        Student student=new Student();
        student.setId(new Integer("4"));
        student.setAddress("中国");
        System.out.println(studentService.updateStudentById(student));
    }
    /*@Test
    public void select()throws Exception{
//        Student student=new Student();
//        student.setId(new Integer("1"));
        List<Student> list=(List<Student>)studentService.findAllStudent(null).getResult();
        for (Student s:list){
            System.out.println(s.toString());
        }*/

}


