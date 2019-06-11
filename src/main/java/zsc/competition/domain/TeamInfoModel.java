package zsc.competition.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TeamInfoModel implements Serializable {

    private Integer groupId;  //团队编号
    private List<Integer> studnetId;//队员学号

    public Integer getGroupId() {
        return groupId;
    }
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

}
