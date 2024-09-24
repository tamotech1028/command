// 「攻撃する」コマンド
public class AttaackCommand implements Command {
    
    private final PlayableCharacter playableCharacter;

    public AttaackCommand(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }

    @Override
    public void excute() {
        playableCharacter.attack();
    }
    @Override
    public void undo() {
        System.out.println("attackコマンドは取り消せません");
    }
}
