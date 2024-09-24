public class MoveSpaceCommand implements Command {
    private final PlayableCharacter playableCharacter;

    public MoveSpaceCommand(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }

    @Override
    public void excute() {
        playableCharacter.moveSpace();
    }

    @Override
    public void undo() {
        playableCharacter.moveForward();
    }
}
