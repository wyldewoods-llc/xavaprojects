package org.openxava.xavaprojects.tests;

import java.time.*;
import java.time.format.*;
import java.util.*;

import org.openxava.tests.*;

/**
 * 
 * @author Javier Paniza
 */

public class IssueTest extends ModuleTestBase {

	public IssueTest(String nameTest) {
		super(nameTest, "Issue");
	}
	
	public void testCreateNewIssue() throws Exception {
		
		login("admin", "admin"); // tmp Mover a clase base
		setValue("title", "JUnit Incident");
		String [][] types = {
			{ "", "" },	
			{ "402880406d26bc62016d26c00e7c0004", "Bug" },
			{ "402880406d26bc62016d26c001890003", "Feature" }
		};
		assertValidValues("type.id", types);
		setValue("type.id", "402880406d26bc62016d26c00e7c0004");
		setValue("description", "This is a JUnit Incident");
		assertValue("createdBy", "admin");
		assertNoEditable("createdBy");
		setValue("closed", "true");
		assertValue("createdOn", getCurrentDate());
		// tmp Falta attachments
		// tmp changeImage("screenshots", "test-files/issue-screenshot.png");
		postDiscussionComment("discussion", "I agree");
		
		execute("CRUD.save");
		execute("Mode.list");
		assertListRowCount(1);
		assertValueInList(0, 0, "JUnit Incident");
		execute("List.viewDetail", "row=0");
		
		assertValue("title", "JUnit Incident");
		assertValue("type.id", "402880406d26bc62016d26c00e7c0004");
		assertValue("description", "This is a JUnit Incident");
		assertValue("createdBy", "admin");
		assertValue("closed", "true");
		assertValue("createdOn", getCurrentDate());
		// tmp Falta attachments
		// tmp assertGalleryImagesCount("screenshots", 1);
		
		assertDiscussionCommentsCount("discussion", 1);
		assertDiscussionCommentContentText("discussion", 0, "I agree");
		
		removeGalleryImage("screenshots", 0);
		execute("CRUD.delete");
		assertNoErrors();
	}
	
	private String getCurrentDate() {
		return LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ENGLISH));
	}

}
