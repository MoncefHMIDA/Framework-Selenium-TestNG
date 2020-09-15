package com.todo.tests;

import java.io.IOException;

import org.testng.annotations.Test;
import com.todo.utils.Setup;
import com.todo.pages.TodoPage;

public class RemoveTodoTest extends Setup {
	
	public RemoveTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test()
	public void iCanRemoveTodo() throws IOException {
		
		todoPage = new TodoPage();
		todoPage.submitTodo(prop.getProperty("todo2"));
	
}
}
