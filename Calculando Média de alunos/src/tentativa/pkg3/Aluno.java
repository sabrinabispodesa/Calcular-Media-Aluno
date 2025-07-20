package tentativa.pkg3;

// é necessário uma classe chamada "aluno" que conterá todas as informações que precisaremos  sobre o aluno.


public class Aluno {
// Esses são os atributos da classe aluno. 
    private String nome;
    private int registroAluno;
// Para as notas precisamos de uma array, já que precisaremos de 3 valores.
    private int[] notas = new int[3];
    private float média;
    private String situação;

// Construtor com todos os atributos.
    public Aluno(String nome, int registroAluno, int[] notas, float média, String situação) {
        this.nome = nome;
        this.registroAluno = registroAluno;
        this.notas = notas;
        this.média = média;
        this.situação = situação;

    }
// Construtor alternativo.

    public Aluno(String nome, int registroAluno, int[] notas) {
        this.nome = nome;
        this.registroAluno = registroAluno;
        this.notas = notas;

    }
 
// Ps métodos "getter" e "setter" a seguir são necessários para acessar os atributos privados.

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getregistroAluno() {
        return this.registroAluno;
    }

    public void setregistroAluno(int registroAluno) {
        this.registroAluno = registroAluno;
    }

    public int[] getnotas() {
        return this.notas;
    }

    public void setnotas(int[] notas) {
        this.notas = notas;
    }

    public float getMédia() {
        return this.média;
    }

    public void setMédia(float média) {
        this.média = média;
    }

    public String getSituação() {
        return this.situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

// Esse método é para calcular a média do aluno.
    public double calcularMedia() {
        double mediaTotal = 0;
        for (int i = 0; i < notas.length; i++) {
            mediaTotal = mediaTotal + notas[i];

        }

        return mediaTotal / 3;

    }
    
// Esse método é verificar a situação do aluno.

    public String verificarSituacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        } else if (calcularMedia() < 7 && calcularMedia() > 0) {
            return "Reprovado";
        } else {
            return "Ausente";
        }

    }
//Essa parte vai imprimir a informção

    @Override
    public String toString() {
        return "Aluno{" + "Nome= " + nome + ", RA= " + registroAluno + ", Média= " + calcularMedia() + ", Situação= " + verificarSituacao() + '}';
    }

}
