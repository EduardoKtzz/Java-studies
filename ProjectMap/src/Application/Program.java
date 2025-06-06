package Application;

import Model.Entities.Candidatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Users\\eduardo.klitzke\\OneDrive - ADCOS PARTICIPAÇÕES LTDA\\Documentos\\Programação\\Programação\\Java\\ProjectMap\\src\\Model\\Txt\\Candidatos.txt";

        //MAP
        Map<String, Candidatos> candidatosMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int valor = Integer.parseInt(fields[1].trim());

                Candidatos candidato = candidatosMap.get(name);

                if (candidato == null) {
                    // Se ainda não existe, adiciona
                    candidato = new Candidatos(name, valor);
                    candidatosMap.put(name, candidato);
                } else {
                    // Se já existe, soma os votos
                    candidato.setVotos(candidato.getVotos() + valor);
                }

                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Exibe o resultado
        for (Map.Entry<String, Candidatos> entry : candidatosMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getVotos());
        }
    }
}
