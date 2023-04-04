
package testepessoa;

import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) {
      Cliente c1 = new Cliente("Fulane", "123-456", 1225.40f);
      c1.setNome("Cleinet1");
      c1.print();
      JOptionPane.showMessageDialog(null, "Juros: " + c1.calculaJuros(1.5f));
      
      Fornecedor f1 = new Fornecedor("Empresa XX", "3456-8979", 1500.89f);
      f1.calculaImpostos(12.5f);
      f1.print();
    }
}