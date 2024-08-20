package 책관리;

public class BookData {
	
	private String title;
	private int price;
	private String writer;
	
	public BookData(String 타이틀, int 가격, String 저자) {
		title = 타이틀;
		price = 가격;
		writer = 저자;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
}
