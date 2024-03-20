public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Lucas", 22, "85974569");

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matrícula: " + a1.getMatricula());

        a1.setNome("Pedro");
        a1.setIdade(34);
        a1.setMatricula("98565478");

        System.out.println("\nInformações atualizadas:");
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Matrícula: " + a1.getMatricula());
    }
}