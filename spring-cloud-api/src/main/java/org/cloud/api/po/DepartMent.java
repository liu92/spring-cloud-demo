package org.cloud.api.po;

import java.io.Serializable;

/**
 * 部门表
 * @Description
 * <br/>
 * @return
 * @exception
 * @author lin
 * @Date 20:09 2019/9/25
 **/

public class Department implements Serializable {
	
	private Integer id;
	private String departmentName;
	
	

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
	
	
	

}
