package scenes;

public class CharacterCreator extends Scene {
    private String name;
    private int classInGame;

    public CharacterCreator() {
        write("Digite o nome do seu personagem: ");
        setName(in.nextLine());
        br();
        write("Escolha sua classe: ");
        showOptions("Guerreiro", "Mago", "Arqueiro");
        setClassInGame(in.nextInt());
        br();
        write("Escolha sua arma: ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassInGame(int classInGame) {
        this.classInGame = classInGame;
    }

    public int getClassInGame() {
        return classInGame;
    }
}