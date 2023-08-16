package homework1;

public class Board {
	private String title;
	private String contents;
	private String name;
	
	
	
	public Board(String title, String contents, String name) {
		this.title = title;
		this.contents = contents;
		this.name = name;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContents() {
		return contents;
	}



	public void setContents(String contents) {
		this.contents = contents;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
