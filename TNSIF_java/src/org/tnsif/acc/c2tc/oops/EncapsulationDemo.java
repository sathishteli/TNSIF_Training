package org.tnsif.acc.c2tc.oops;


	
	class Human{
		
		private String name;
		private int age;
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public int getAge() {
			return age;
		}
		
		
	}
	public class EncapsulationDemo {
		
	public static void main(String[] args) {
		
		Human obj = new Human();
		
		obj.setAge(26);
		obj.setName("RAM");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(22);
		obj.setName("SITA");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}
