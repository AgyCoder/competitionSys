package zsc.competition.domain;

import lombok.Data;

import java.io.Serializable;

/*
* 用户实体类
*
* */
@Data
public class UserModel implements Serializable {

    private Integer userCode;//用户码(职工号或学号)
    private String password;//密码
    private Integer role;  //0是老师，1是学生

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
