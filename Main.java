public class Main {
    public static void main(String[] args) {
        PlayableCharacter mainCharacter = new PlayableCharacter();
        GameController controller = new GameController();

        Command moveForwarCommand = new MoveForwardCommand(mainCharacter);
        Command moveSpaceCommand = new MoveSpaceCommand(mainCharacter);
        Command jumpCommand = new JumpCommand(mainCharacter);
        Command attackCommand = new AttaackCommand(mainCharacter);
        Command defenseCommand = new DefenseCommand(mainCharacter);

        controller.executeCommand(moveForwarCommand);
        controller.executeCommand(jumpCommand);
        controller.executeCommand(attackCommand);
        controller.executeCommand(defenseCommand);
        controller.executeCommand(moveSpaceCommand);

        controller.undoLastCommand();
        controller.undoLastCommand();
        controller.undoLastCommand();

    }
}