import java.util.ArrayList;

public class PetShop {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Cao> caes = new ArrayList<>();
    ArrayList<Agendamento> agendamentos = new ArrayList<>();


    // ADICIONAR CLIENTE
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }


    // BUSCAR CLIENTE
    public Cliente buscarCliente(String cpf) {

        for (Cliente c : clientes) {

            if (c.cpf.equals(cpf)) {
                return c;
            }

        }

        return null;
    }


    // ADICIONAR CAO
    public void adicionarCao(Cao cao) {
        caes.add(cao);
    }


    // BUSCAR CAO
    public Cao buscarCao(String chip) {

        for (Cao c : caes) {

            if (c.chip.equals(chip)) {
                return c;
            }

        }

        return null;
    }


    // LISTAR CLIENTES
    public void listarClientes() {

        for (Cliente c : clientes) {

            System.out.println("CPF: " + c.cpf);
            System.out.println("Nome: " + c.nome);
            System.out.println("Idade: " + c.idade);
            System.out.println("---------------------");

        }

    }


    // LISTAR CAES
    public void listarCaes() {

        for (Cao c : caes) {

            System.out.println("Chip: " + c.chip);
            System.out.println("Nome: " + c.nome);
            System.out.println("Idade: " + c.idade);
            System.out.println("CPF dono: " + c.cpfDono);
            System.out.println("---------------------");

        }

    }


    // REMOVER CLIENTE
    public boolean removerCliente(String cpf) {

        Cliente c = buscarCliente(cpf);

        if (c != null) {
            clientes.remove(c);
            return true;
        }

        return false;
    }


    // REMOVER CAO
    public boolean removerCao(String chip) {

        Cao c = buscarCao(chip);

        if (c != null) {
            caes.remove(c);
            return true;
        }

        return false;
    }


    // CALCULAR SERVIÇO
    public double calcularServico(int servico, int tamanho) {

        double valor = 0;

        if (servico == 1) { // banho

            if (tamanho == 1) valor = 30;
            if (tamanho == 2) valor = 40;
            if (tamanho == 3) valor = 50;

        }

        if (servico == 2) { // tosa

            if (tamanho == 1) valor = 40;
            if (tamanho == 2) valor = 50;
            if (tamanho == 3) valor = 60;

        }

        if (servico == 3) { // banho + tosa

            if (tamanho == 1) valor = 60;
            if (tamanho == 2) valor = 80;
            if (tamanho == 3) valor = 100;

        }

        return valor;
    }


    // AGENDAR SERVIÇO
    public boolean agendarServico(String chip, String servico, String horario) {

        for (Agendamento a : agendamentos) {

            if (a.horario.equals(horario)) {
                return false;
            }

        }

        Agendamento ag = new Agendamento(chip, servico, horario);
        agendamentos.add(ag);

        return true;
    }


    // VER AGENDA
    public void verAgenda() {

        for (Agendamento a : agendamentos) {

            System.out.println("Chip cão: " + a.chipCao);
            System.out.println("Serviço: " + a.servico);
            System.out.println("Horário: " + a.horario);
            System.out.println("---------------------");

        }

    }


    // CANCELAR AGENDAMENTO
    public boolean cancelarAgendamento(String chip) {

        for (Agendamento a : agendamentos) {

            if (a.chipCao.equals(chip)) {

                agendamentos.remove(a);
                return true;

            }

        }

        return false;
    }

}