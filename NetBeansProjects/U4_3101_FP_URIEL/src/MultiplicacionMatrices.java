
import javax.swing.JOptionPane;


public class MultiplicacionMatrices {
    public static void main(String[] args) {
        String sup[] = {"","0","1","2"};
        String izq[] = {"0 |","1 |","2 |"};
        byte tabla1[][] = new byte [3][3];
        byte tabla2[][] = new byte [3][3];
        byte x,y,z;
        for (x = 0; x < 3; x++){
            for(y = 0; y < 3; y++){
                tabla1[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 1 casilla: " +
                            x+","+y));
            }
        }    
        for (x = 0; x < 3; x++){
            for(y = 0; y < 3; y++){
                tabla2[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa los numeros de la tabla 2 casilla: " +
                       x+","+y));    
            }    
        }
   
         for (byte a = 1; a<3; a++){
            System.out.println("Tabla " + a);
            for(x = 0; x <4; x++){
                System.out.print(sup[x] + "\t");
         
                System.out.println();
                for (x = 0; x < 3; x++){
                    System.out.print(izq[x] + "\t");
                    for (y = 0; y < 3; y++){ 
                    System.out.print(tabla1[x][y] + "\t");
                    }    
                    System.out.println();
            }   
            System.out.println();
            System.out.println("Tabla 2");
            for (x = 0; x <4; x++){
                System.out.print(sup[x] + "\t");
          }    
            System.out.println();
            for (x = 0; x < 3; x++){
                System.out.print(izq[x] + "\t");
                for (y = 0; y < 3; y++){ 
                    System.out.print(tabla2[x][y] + "\t");
                }    
                System.out.println();
                }
        }    
    }     
        }
}

