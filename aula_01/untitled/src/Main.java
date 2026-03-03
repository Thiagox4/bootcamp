import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> cpfCliente = new ArrayList<>();
        ArrayList<String> nomeCliente = new ArrayList<>();
        ArrayList<Integer> idadeCliente = new ArrayList<>();

        ArrayList<String> chipCao = new ArrayList<>();
        ArrayList<String> nomeCao = new ArrayList<>();
        ArrayList<Integer> idadeCao = new ArrayList<>();
        ArrayList<String> cpfDonoCao = new ArrayList<>();

        int op;

        do {
            System.out.println("\n=== seja bem vindo! ===");
            System.out.println("\n=== PETSHOP ===");
            System.out.println("\no que você dejesa fazer hoje? ");
            System.out.println("1-criar usuário | 2-Consultar | 3-Alterar | 4-Excluir | 0-Sair");
            op = sc.nextInt();
            sc.nextLine();

            //  ADD
            if (op == 1) {

                System.out.print("CPF Cliente: ");
                String cpf = sc.nextLine();

                if (!cpfCliente.contains(cpf)) {
                    cpfCliente.add(cpf);

                    System.out.print("Nome Cliente: ");
                    nomeCliente.add(sc.nextLine());

                    System.out.print("Idade Cliente: ");
                    idadeCliente.add(sc.nextInt());
                    sc.nextLine();
                }

                System.out.print("Chip do Cão: ");
                chipCao.add(sc.nextLine());

                System.out.print("Nome do Cão: ");
                nomeCao.add(sc.nextLine());

                System.out.print("Idade do Cão: ");
                idadeCao.add(sc.nextInt());
                sc.nextLine();

                cpfDonoCao.add(cpf);

                System.out.println("Cadastro realizado!");

            }

            //  CONSULTAR
            else if (op == 2) {

                for (int i = 0; i < cpfCliente.size(); i++) {

                    System.out.println("\nCliente: " + nomeCliente.get(i)
                            + " | CPF: " + cpfCliente.get(i)
                            + " | Idade: " + idadeCliente.get(i));

                    for (int j = 0; j < chipCao.size(); j++) {
                        if (cpfDonoCao.get(j).equals(cpfCliente.get(i))) {
                            System.out.println("   Cão: " + nomeCao.get(j)
                                    + " | Chip: " + chipCao.get(j)
                                    + " | Idade: " + idadeCao.get(j));
                        }
                    }
                }
            }

            //  ALTERAR
            else if (op == 3) {

                System.out.println("1-Cliente  2-Cão");
                int tipo = sc.nextInt();
                sc.nextLine();

                if (tipo == 1) {

                    System.out.print("Digite o CPF: ");
                    String cpf = sc.nextLine();

                    for (int i = 0; i < cpfCliente.size(); i++) {
                        if (cpfCliente.get(i).equals(cpf)) {

                            System.out.println("1-Nome  2-Idade");
                            int campo = sc.nextInt();
                            sc.nextLine();

                            if (campo == 1) {
                                System.out.print("Novo nome: ");
                                nomeCliente.set(i, sc.nextLine());
                            } else if (campo == 2) {
                                System.out.print("Nova idade: ");
                                idadeCliente.set(i, sc.nextInt());
                                sc.nextLine();
                            }

                            System.out.println("Cliente alterado!");
                        }
                    }

                } else if (tipo == 2) {

                    System.out.print("Digite o CPF do dono: ");
                    String cpf = sc.nextLine();

                    boolean encontrou = false;

                    for (int i = 0; i < chipCao.size(); i++) {

                        if (cpfDonoCao.get(i).equals(cpf)) {

                            encontrou = true;

                            System.out.println("Posição: " + i
                                    + " | Nome: " + nomeCao.get(i)
                                    + " | Chip: " + chipCao.get(i));
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Cliente não possui animais.");
                    } else {

                        System.out.print("Qual posição deseja alterar? ");
                        int pos = sc.nextInt();
                        sc.nextLine();

                        System.out.println("1-Nome  2-Idade");
                        int campo = sc.nextInt();
                        sc.nextLine();

                        if (campo == 1) {
                            System.out.print("Novo nome do cão: ");
                            nomeCao.set(pos, sc.nextLine());
                        } else if (campo == 2) {
                            System.out.print("Nova idade do cão: ");
                            idadeCao.set(pos, sc.nextInt());
                            sc.nextLine();
                        }

                        System.out.println("Cão alterado!");
                    }
                }
            }

            // ================= EXCLUIR =================
            else if (op == 4) {

                System.out.print("Digite o CPF do cliente para excluir: ");
                String cpf = sc.nextLine();

                for (int i = 0; i < cpfCliente.size(); i++) {
                    if (cpfCliente.get(i).equals(cpf)) {

                        cpfCliente.remove(i);
                        nomeCliente.remove(i);
                        idadeCliente.remove(i);

                        for (int j = chipCao.size() - 1; j >= 0; j--) {
                            if (cpfDonoCao.get(j).equals(cpf)) {
                                chipCao.remove(j);
                                nomeCao.remove(j);
                                idadeCao.remove(j);
                                cpfDonoCao.remove(j);
                            }
                        }

                        System.out.println("Cliente e animais excluídos!");
                        break;
                    }
                }
            }

        } while (op != 0);

        sc.close();
    }
}