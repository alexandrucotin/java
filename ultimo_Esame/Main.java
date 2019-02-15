public class Main {

	public static void main(String[] args) {
		Song yellowSubmarine = new Song("The toxicity of our city, of our city");
		yellowSubmarine.add(EnglishNote.C_SHARP, 4);  // C# su "town"
		yellowSubmarine.add(EnglishNote.C_SHARP, 23); // C# su "sea"
		yellowSubmarine.add(EnglishNote.F_SHARP, 37); // F# su "born"
		yellowSubmarine.add(EnglishNote.G_SHARP, 42); // G# su "man"
		// yellowSubmarine.add(EnglishNote.A, 24); // questo genenerebbe una NoteAtSamePositionException

		System.out.println(yellowSubmarine);
	}
}