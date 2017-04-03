/**
 * Created by nagyza on 2017.04.03..
 */
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
  }

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
}
