
import javax.swing.JOptionPane;

public class MultiplicacionArreglos {

    public static void main(String[] args) {
        byte tabla1[][] = new byte[3][3];
        byte tabla2[][] = new byte[3][3];
        short tabla3[][] = new short[3][3];
        byte a, b, z;
        for (a = 0; a < 3; a++) {
            for (b = 0; b < 3; b++) {
                tabla1[a][b] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 1 casilla: "
                        + a + "," + b));
            }
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
