package com.functionalInterfaces;

@FunctionalInterface
interface ToDo{
    //void todo1();
    //String userCredential(String userName,String pwd);
	String showName(String name);
}
class Task{
	public void _task1() {
		System.out.println("Task completed");
		
	}
	
	public static String login(String userName,String password) {
		if(userName.equals("admin") && password.equals("admin")) {
			return "LoggedIn";
		}
		return "Login Fail";
	}
}


public class Test3 {

	public static void main(String[] args) {
//		Task t = new Task();
//		ToDo t1 = t::_task1;
//		t1.todo1();
       
//		ToDo t=Task::login;
//		System.out.println(t.userCredential("admin", "admin"));
//		
		
		ToDo t = String::toUpperCase;
		System.out.println(t.showName("harsh"));
		
		
	}

}
