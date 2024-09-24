// 「前進する」コマンド
public class MoveForwardCommand implements Command {

    private final PlayableCharacter playableCharacter;

    public MoveForwardCommand(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }

    @Override
    public void excute() {
        playableCharacter.moveForward();
    }
    @Override
    public void undo() {
        playableCharacter.moveSpace();
    }
}
