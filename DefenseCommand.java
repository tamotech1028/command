public class DefenseCommand implements Command {
    private final PlayableCharacter playableCharacter;

    public DefenseCommand(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }

    @Override
    public void excute() {
        playableCharacter.defense();;
    }

    @Override
    public void undo() {
        System.out.println("defenseコマンドは取り消せません");
    }
}
