package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	/**
	 * The personBean object of type Person declared in the Register Action class
	 * matches the personBean name we used in the form�s textfields. When the form
	 * is submitted, the Struts 2 framework will inspect the Action class and look
	 * for an object named personBean. It will create that object using the Person
	 * class�s default constructor. Then for each form field that has a name value
	 * of personBean.someAttribute (e.g personBean.firstName) it will call the
	 * personBean�s public set method for that attribute and pass it the form
	 * field�s value (the user input). This all happens before the execute method
	 * occurs.
	 */
	public String execute() throws Exception {
		// call Service class to store personBean's state in database

		return SUCCESS;
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", "First name is required.");
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", "Email is required.");
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", "Age is required and must be 18 or older");
		}
	}
}
