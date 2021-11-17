package com.xlx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xianglongxiang
 * @title: Student
 * @projectName springboot-1
 * @date 2021/11/16 9:21
 */

@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;

}
