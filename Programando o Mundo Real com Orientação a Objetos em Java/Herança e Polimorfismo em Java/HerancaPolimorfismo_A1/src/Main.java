public class Main {
    public static void main(String[] args) {

        // =========================
        // EMPLOYEE
        // =========================

        Employee employee = new Employee();

        employee.setCode("EMP 1001");
        employee.setName("Carlos");
        employee.setAdress("São Paulo");
        employee.setSalary(3500);
        employee.setAge(30);

        System.out.println("=== EMPLOYEE ===");
        System.out.println("Código: " + employee.getCode());
        System.out.println("Nome: " + employee.getName());
        System.out.println("Endereço: " + employee.getAdress());
        System.out.println("Salário: R$ " + employee.getSalary());
        System.out.println("Idade: " + employee.getAge());


        // =========================
        // MANAGER
        // =========================

        Manager manager = new Manager();

        // Métodos herdados de Employee
        manager.setCode("GER 1001");
        manager.setName("João");
        manager.setAdress("Rio de Janeiro");
        manager.setSalary(12000);
        manager.setAge(40);

        // Métodos específicos de Manager
        manager.setLogin("joao");
        manager.setPassword("123456");
        manager.setComission(2500);

        System.out.println("\n=== MANAGER ===");
        System.out.println("Código: " + manager.getCode());
        System.out.println("Nome: " + manager.getName());
        System.out.println("Endereço: " + manager.getAdress());
        System.out.println("Salário: R$ " + manager.getSalary());
        System.out.println("Idade: " + manager.getAge());
        System.out.println("Login: " + manager.getLogin());
        System.out.println("Senha: " + manager.getPassword());
        System.out.println("Comissão: R$ " + manager.getComission());


        // =========================
        // SALESMAN
        // =========================

        Salesman salesman = new Salesman();

        // Métodos herdados de Employee
        salesman.setCode("VEN 1001");
        salesman.setName("Pedro");
        salesman.setAdress("Belo Horizonte");
        salesman.setSalary(3000);
        salesman.setAge(27);

        // Métodos específicos de Salesman
        salesman.setSoldAmount(25000);
        salesman.setComission(1500);
        salesman.setSalesQuantity(20);
        salesman.setCommissionPercentage(5);

        System.out.println("\n=== SALESMAN ===");
        System.out.println("Código: " + salesman.getCode());
        System.out.println("Nome: " + salesman.getName());
        System.out.println("Endereço: " + salesman.getAdress());
        System.out.println("Salário: R$ " + salesman.getSalary());
        System.out.println("Idade: " + salesman.getAge());
        System.out.println("Valor vendido: R$ " + salesman.getSoldAmount());
        System.out.println("Comissão: R$ " + salesman.getComission());
        System.out.println("Quantidade de vendas: " + salesman.getSalesQuantity());
        System.out.println("Percentual de comissão: "
                + salesman.getComissionPercentage() + "%");
    }
}