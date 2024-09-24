import java.util.Stack;

public class GameController {
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.excute();
        commandHistory.push(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.empty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("コマンド履歴はありません。");
        }
    }
}
