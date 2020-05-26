package my.sunghyuk.edabit.easy;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class GetExtensionTests {
	@Test 
	public void test1() {
		assertThat(Challenge.getExtension(new String[]{"project1.jpg", "project1.pdf", "project1.mp3"}), is(new String[]{"jpg", "pdf", "mp3"}));
	}
	
	@Test 
	public void test2() {
		assertThat(Challenge.getExtension(new String[]{"ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"}), is(new String[]{"rb", "cpp", "py", "js"}));
	}
	
	@Test 
	public void test3() {
		assertThat(Challenge.getExtension(new String[]{"code.html", "code.css"}), is(new String[]{"html", "css"}));
	}
	
	@Test 
	public void test4() {
		assertThat(Challenge.getExtension(new String[]{"minesweeper.java", "game.java", "my_project.java"}), is(new String[]{"java", "java", "java"}));
	}
}