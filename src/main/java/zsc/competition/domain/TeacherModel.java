package zsc.competition.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeacherModel implements Serializable {


    private Integer teacherId;    //教师工号
    private String name;       //姓名
    private String institute;  //学院
    private String office;     //办公室
    private String telephone;  //电话号码
    private Integer sex;       //性别
    private String email;      //邮箱

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
