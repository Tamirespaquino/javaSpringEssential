package app;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner enter = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = enter.nextLine();
        System.out.print("Salario bruto: R$ ");
        double grossSalary = enter.nextDouble();

        Employee employee = new Employee(name, grossSalary);
        SalaryService salaryService = new SalaryService();

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario liquido: R$ %.2f%n", netSalary);

        enter.close();
    }
}
