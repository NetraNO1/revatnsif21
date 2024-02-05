package com.netra.basicprogramming;

public class SetGetProgram {

		
		private String name,gender;
		private int age, income;
		
		public String getName() {
			return name;
			
		}
		
		public void setName(String Name) {
			this.name=Name;
		}
		
		public String getGender() {
			return gender;
		}
		public void setGender(String Gender) {
			this.gender=Gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int Age) {
			this.age=Age;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int Income) {
			this.income=Income;
		}

		@Override
		public String toString() {
			return "name=" + name + ", gender=" + gender + ", age=" + age + ", income=" + income + "";
		}
		
		
	}



