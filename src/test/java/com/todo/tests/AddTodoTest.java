package com.todo.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.todo.pages.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
	}

	TodoPage todoPage;

	@Test()
	public void iCanAddTodo() throws IOException {
		
		todoPage = new TodoPage();
		boolean elementText=todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String elementTodo=todoPage.checkElementContains(TodoPage.element_1);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		boolean checkbox=todoPage.isCheckboxSelected(TodoPage.checkbox);
		Assert.assertTrue(checkbox);
		
	}

}
