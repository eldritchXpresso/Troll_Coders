public class TestBooks
{
	public static void main(String[] args)
	{
		Books b;
		b = new RegularBooks();
		b.bookType();
		b.readType();
		b.specificMethod();
		((RegularBooks) b).bookType();

		b = (Books) new eBooks();
		b.bookType();
		b.readType();
		b.specificMethod();
		((eBooks) b).bookType();

		b = (Books) new AudioBook();
		b.bookType();
		b.readType();
		b.specificMethod();
		((AudioBook) b).bookType();
	}
}
