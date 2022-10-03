package com.stackroute.studentapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

		@Id
		String id;
		String name;
		String subject;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		
		
}
