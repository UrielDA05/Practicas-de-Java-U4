
import javax.swing.JOptionPane;


public class MultiplicacionArreglos {
    public static void main(String[] args) {
        
   
        String sup[] = {"","0","1","2"};
        String izq[] = {"0 |","1 |","2 |"};
        byte tabla1[][] = new byte [3][3];
        byte tabla2[][] = new byte [3][3];
        byte a,b,c;
        for (a = 0; a < 3; a++){
            for(b = 0; b < 3; b++){
                tabla1[a][b] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 1 casilla: " +
                            a+","+b));
            }
        }    
        for (a = 0; a < 3; a++){
            for(b = 0; b < 3; b++){
                tabla2[a][b] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 2 casilla: " +
                       a+","+b));    
            }    
        }
        for (a = 0; a < 3; a++)
            if (a == 0){
                for (b = 0; b < 3; b++){
                    System.out.print(tabla1[a][b] + "|\t");
                }
                System.out.print("   \t");
                for (b = 0; b < 3; b++){
                    System.out.print(tabla2[a][b] + "|\t");
                }
                System.out.println("   ");
            }else if (a == 1){
                for (b = 0; b < 3; b++){
                    System.out.print(tabla1[a][b] + "|\t");
                }
                System.out.print("   \t");
                for (b = 0; b < 3; b++){
                    System.out.print(tabla2[a][b] + "|\t");
                }
                System.out.println("   ");
            }else{
                for (b = 0; b < 3; b++){
                    System.out.print(tabla1[a][b] + "|\t");
                }
                System.out.print("   \t");
                for (b = 0; b < 3; b++){
                    System.out.print(tabla2[a][b] + "|\t");
                }
                System.out.println("   ");    
        }
}
}
