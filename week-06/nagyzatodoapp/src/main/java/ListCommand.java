public class ListCommand extends Command {
  public ListCommand() {
    super("-l", "Lists all the tasks", "Lists all the tasks");
  }

  @Override
  public void execute (String[] arguments) {
    FileHandler readFile = new FileHandler();
    if (readFile.getTasklist().size() == 0) {
      System.out.println("No todo for today.");
    } else {
      for (Tasks tasks : readFile.getTasklist()) {
        System.out.println(tasks.toString());
      }
    }
  }
}
