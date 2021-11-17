    package com.xlx.repository;

    import com.xlx.entity.Student;

    import java.util.Collection;

    /**
     * @author xianglongxiang
     * @title: StudentRepository
     * @projectName springboot-1
     * @date 2021/11/16 9:23
     */

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);

}
