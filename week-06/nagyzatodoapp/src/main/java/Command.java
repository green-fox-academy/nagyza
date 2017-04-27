
public abstract class Command {
  private String argument;
  private String commandDescription;
  private String detailedHelp;

  public Command(String argument, String commandDescription, String detailedHelp) {
    this.argument = argument;
    this.commandDescription = commandDescription;
    this.detailedHelp = detailedHelp;
  }

  public abstract void execute(String[] argument);

  public String getArgument() {
    return argument;
  }

  public String getCommandDescription() {
    return commandDescription;
  }

  public String getDetailedHelp() {
    return detailedHelp;
  }
}
