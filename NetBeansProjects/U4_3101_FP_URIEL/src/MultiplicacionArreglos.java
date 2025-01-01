
import javax.swing.JOptionPane;

public class MultiplicacionArreglos {

    public static void main(String[] args) {
        
        }
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 3; b++) {
                tabla2[a][b] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 2 casilla: "
                        + a + "," + b));
            }
        }
        z = 2;
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 3; b++) {
                tabla3[a][b] = (short) (tabla1[a][b] * tabla2[z - a][z - b]);
            }
        }
         System.out.println();
        for (a = 0; a < 3; a++){    
            for (b = 0; b < 3; b++){
                System.out.print(tabla1[a][b] + "|\t");
            }
            System.out.print("   \t");
            for (b = 0; b < 3; b++){
                System.out.print(tabla2[a][b] + "|\t");
            }
            System.out.print("   \t");
            for (b = 0; b < 3; b++){
                System.out.print(tabla3[a][b] + "|\t");
             
            }
            System.out.println("   ");
    }
}
}
