import java.util.ArrayList;
import java.util.List;

public class TodoApp {
  List<Command> commands;

  public TodoApp() {
    this.commands = new ArrayList<>();
    this.commands.add(new ListCommand());
    this.commands.add(new AddCommand());
  }

  public void run (String[] args) {
    if (args.length == 0) {
      System.out.println("Java Todo application\n=======================\nCreated by nagyza" +
              "\n=======================\n\nCommand line arguments:");
      for (Command command : this.commands) {
        System.out.println(command.getArgument() + "  " + command.getCommandDescription());
      }
    } else {
      for (Command command : this.commands) {
        if (args[0].equals(command.getArgument())) {
          command.execute(args);
        } else {
          System.out.println("Unsupported argument!");
        }
      }
    }
  }
}