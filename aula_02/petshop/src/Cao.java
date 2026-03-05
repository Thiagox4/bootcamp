public class Cao {

     String chip;
     String nome;
     int idade;
     String cpfDono;

    public Cao(String chip, String nome, int idade, String cpfDono) {
        this.chip = chip;
        this.nome = nome;
        this.idade = idade;
        this.cpfDono = cpfDono;
    }

    public String getChip() {
        return chip;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}