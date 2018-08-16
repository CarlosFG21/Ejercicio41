

package ejercicio41video50;

import javax.swing.JOptionPane;


public class Ejercicio41Video50 {

    
    public static void main(String[] args) {
        
        int numero1,numero2,suma,resta,mult,division;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO"));
        
        operacion = JOptionPane.showInputDialog("DIGITE LA OPERACION QUE DESEA RALIZAR").charAt(0);
        
        switch(operacion){
            
            case 's':
            case 'S':suma = numero1+numero2;
                     JOptionPane.showMessageDialog(null,"LA SUMA ES: " + suma);
            break;
            
            
            case 'r':
            case 'R':resta = numero1-numero2;
                     JOptionPane.showMessageDialog(null,"LA RESTA ES: " + resta);
            break;
            
            case 'p':
            case 'P':
            case 'm':
            case 'M': mult = numero1*numero2;
                     JOptionPane.showMessageDialog(null,"LA MULTIPLICACION ES: " + mult);
            break;
            
            case 'd':
            case 'D':division = numero1+numero2;
                     JOptionPane.showMessageDialog(null,"LA DIVISION ES: " + division);
                     
            default: JOptionPane.showMessageDialog(null,"ERROR SE EQUIVOCO DE OPERACION");
        }
        
    }
    
}
