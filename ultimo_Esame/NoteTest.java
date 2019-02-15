import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Test;

public class NoteTest {

	@Test
	public void testToString() {
		assertEquals(ItalianNote.DO.toString(), "do");
	}

	@Test
	public void testEquals() {
		assertEquals(ItalianNote.RE_DIESIS, EnglishNote.D_SHARP);
	}
}