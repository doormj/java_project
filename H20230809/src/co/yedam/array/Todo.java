package co.yedam.array;

public class Todo {
	int no;
	String todo;
	String dueDate;
	boolean done;


	void showInfotd() {
		System.out.printf("순서: %d, 할일: %s, 날짜: %s, 상태: %s", 
				no, todo, dueDate, done);
		}
	}