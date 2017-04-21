public class AddCommand extends Command {

  public AddCommand() {
    super("-a", "Adds a new task", "-a [<task>]  Adds a new task\n" +
            "    [<task>] [<priority>] Adds a new task with priority number");
  }

  @Override
  public void execute() {

  }
}
