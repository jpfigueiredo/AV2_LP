package Q1;

import javax.swing.JOptionPane;
import java.util.*;


public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 int i,j;
	     ArrayList<String> cadastro = new ArrayList();

	  
	    
	     do
	     {
	     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar Carro\n2-Listagem Geral\n3-Mostrar Resultados\n4-Sair");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                
	            	String marca= JOptionPane.showInputDialog("Digite a Marca: ");
	                String modelo= JOptionPane.showInputDialog("Digite o Modelo: ");
	                String ano= JOptionPane.showInputDialog("Digite o Ano: ");
	                String valor= JOptionPane.showInputDialog("Digite o valor: ");
	                
	                
	                cadastro.add(marca+" - "+modelo+" - "+ano+" - "+valor);
	                JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
	                 break;
	             
	             case 2:
	 
	                   j = 0;
	                    Iterator<String> iterator = cadastro.iterator();
	                    while (iterator.hasNext()) {
	                      System.out.printf("Posição %d- %s\n", j, iterator.next());
	                      j++;
	                    }
	                    break;
	             
	             case 3:
	             
	             
	             
	             
	             
	             
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (i!=4);
		
		
		
		
		
		
		
		
		
		
	}

}
