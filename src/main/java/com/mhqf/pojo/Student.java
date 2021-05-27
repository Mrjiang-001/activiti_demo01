package com.mhqf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mhqf
 * @version 1.0
 * @date 2021/5/27 16:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String student_no;
    private String name;
    private String gender;
    private Date birthday;
    private String province_code;
    private String address;
}
