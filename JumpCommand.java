public class JumpCommand implements Command {
    private final PlayableCharacter playableCharacter;

    public JumpCommand(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }

    @Override
    public void excute() {
        playableCharacter.jump();
    }

    @Override
    public void undo() {
        System.out.println("jumpコマンドは取り消せません");
    }
}
