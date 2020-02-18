package com.task.hibernate.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Task")
public class Task 
{
	
	@Id
	@Column(name="taskId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     int taskId;
	
	@Column(name="taskName")
    String taskName;
	
	@Column(name="taskStartDate")
     Date taskStartDAte;
    
	@Column(name="taskPriority")
	int taskPriority;
	
	@Column(name="taskEndDate")
    Date taskEndDate;
    
	@Id
	@Column(name="parentTaskId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int parentTaskId;
	
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
public Date getTaskStartDAte() {
	return taskStartDAte;
}
public void setTaskStartDAte(Date taskStartDAte) {
	this.taskStartDAte = taskStartDAte;
}
public int getTaskPriority() {
	return taskPriority;
}
public void setTaskPriority(int taskPriority) {
	this.taskPriority = taskPriority;
}
public Date getTaskEndDate() {
	return taskEndDate;
}
public void setTaskEndDate(Date taskEndDate) {
	this.taskEndDate = taskEndDate;
}
public int getParentTaskId() {
	return parentTaskId;
}
public void setParentTaskId(int parentTaskId) {
	this.parentTaskId = parentTaskId;
}



	
	
}
