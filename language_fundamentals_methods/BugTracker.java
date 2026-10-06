package com.language_fundamentals_methods;

public class BugTracker {
	
	int bugid;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugid() {
	 return bugid;	
	}
	
	String getapplicationName() {
		return applicationName;
	}
	
	String getbugTitle() {
	 return bugTitle;	
	}
	
	String getseverity() {
		return severity;
	}
	
	String getpriority() {
		return priority;
	}
	
	String getstatus() {
		return status;
	}
	
	String getassignedDeveloper() {
		return assignedDeveloper;
	}
	
// assign developer
	
	void assignToDeveloper(int bugid,String developerName) {
		if(this.bugid ==bugid) {
			this.assignedDeveloper = developerName;
		updatestatus("in develpment");	
		}
	}	
//updatestatus
	
	 void updatestatus(String newstatus) {
		status = newstatus;
	}
	 
//display complete bug details
	 
	void displaybugsummary() {
		System.out.println("bugid :"+getbugid());
		System.out.println("applicationName :"+getapplicationName());
		System.out.println("bugTitle :"+getbugTitle());
		System.out.println("severity :"+getseverity());
		System.out.println("priority:"+getpriority());
		System.out.println("***************** Assigned to Developer *****************");
		System.out.println("assignedDeveloper:"+getassignedDeveloper());
		System.out.println("status :"+getstatus());
		
	}
	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.bugid = 101;
		b.applicationName = "banking application";
		b.bugTitle = "login problem";
		b.severity = "high";
		b.priority = "high";
		b.status = "open";
		b.assignedDeveloper ="not assigned";
		
// assign developer
		
		b.assignToDeveloper(101, "nani");
		
//display details
		
	b.displaybugsummary();
	
	}
}
		
	

