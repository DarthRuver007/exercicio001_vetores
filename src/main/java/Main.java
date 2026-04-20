

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nomes[] = new String [100];
        int N = Integer.parseInt (JOptionPane.showInputDialog("Digite a quantidade de alunos: "));
        for (int i = 0; i< N; i++){
            nomes [i] = JOptionPane.showInputDialog("Digite o nome [" + (i + 1) +"]");
        }
        for (int i = 0; i<N;i++){
            System.out.println("Nome: " + i + ":" + nomes[i]);
        }
    }
}
