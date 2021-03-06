package beemovie;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ProgramTest {

	@Test
	public void test()
	{
		Assert.assertEquals("b b b", Program.meme("b b"));
		Assert.assertEquals("bobobo bobobo ba bobobo ba bien", Program.meme("bobobo ba bien"));
		Assert.assertEquals("", Program.meme(""));
		Assert.assertEquals("hola a todos", Program.meme("hola a todos"));
		Assert.assertEquals("bota bota bota bota bota bota", Program.meme("bota bota bota"));
		Assert.assertEquals("un pato que un pato que bota", Program.meme("un pato que bota"));
		Assert.assertEquals("bien bien bad bien bad bad", Program.meme("bien bad bad"));
		Assert.assertEquals(" ", Program.meme(" "));
		Assert.assertEquals("rbrbrbrbrbrbr", Program.meme("rbrbrbrbrbrbr"));
		Assert.assertEquals("b", Program.meme("b"));
		Assert.assertEquals("Assert.assertEquals(expected, actual);", Program.meme("Assert.assertEquals(expected, actual);"));
		Assert.assertEquals("a a b c", Program.meme("a b c"));
	}

}
