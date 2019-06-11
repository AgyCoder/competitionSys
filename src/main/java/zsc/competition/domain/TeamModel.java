package zsc.competition.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamModel implements Serializable {

    private Integer studentId;     //报名人id
    private Integer itemId;     //比赛项目id
    private String teacherName; //指导老师姓名
    private Integer teamRole;   //0是个人,1是团体
    private Integer state;      //审核状态0待审核，1通过，2未通过

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

}
