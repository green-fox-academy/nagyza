/**
 * Created by nagyza on 2017.04.03..
 */
public class UseBlogPost {
  public static void main(String[] args) {
    BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2005.05.04.");
    BlogPost blogPost2 = new BlogPost();
    BlogPost blogPost3 = new BlogPost();
    blogPost2.authorName = "Tim Urban";
    blogPost2.title = "Wait but why";
    blogPost2.publicationDate = "2010.10.10.";
    blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    blogPost3.authorName = "William Turton";
    blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    blogPost3.publicationDate = "2017.03.28.";
    blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
            "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
            "really into the whole organizer profile thing.";
  }
}
