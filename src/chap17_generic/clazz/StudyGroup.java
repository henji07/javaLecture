package chap17_generic.clazz;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup<T> {
	private List<T> groupList = new ArrayList<T>();

	
	public List<T> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<T> groupList) {
		this.groupList = groupList;
	}
	
	//생성자
	public StudyGroup() {
		this.groupList = groupLIst;
	}
	
	//메소드
	public List<String> getCap() {
		

	}

	public List<String> getMembers() {
		
	}
}
