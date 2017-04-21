public class ListCommand extends Command {
  public ListCommand() {
    super("-l", "Lists all the tasks", "Lists all the tasks");
  }

  @Override
  public void execute () {
    FileHandler readFile = new FileHandler();
    for (String line : readFile.readFileTodo()) {
      System.out.println(line);
    }
  }
}
