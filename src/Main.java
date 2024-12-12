import entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo CSV: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Sale> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                list.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));

                line = br.readLine();
            }

            List<Sale> top5sales = list.stream().filter(x -> x.getYear() == 2016).sorted(Comparator.comparing(Sale::averagePrice).reversed()).limit(5).collect(Collectors.toList());
            System.out.println("Cinco primeiras vendas de 2016 com maior preço médio:");
            top5sales.forEach(System.out::println);

            double totalLogan = list.stream()
                    .filter(s -> s.getSeller().equals("Logan"))
                    .filter(s -> s.getMonth() == 1 || s.getMonth() == 7)
                    .mapToDouble(Sale::getTotal)
                    .sum();

            System.out.printf("Valor total vendido por Logan nos meses 1 e 7: %.2f%n", totalLogan);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}

