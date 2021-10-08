package bloquesabc;

import java.util.Scanner;

/**
 * @author sebascarag
 */
public class BloquesABC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] blocksABC1 = {'B', 'X', 'D', 'C', 'N', 'G', 'R', 'T', 'Q', 'F', 'H', 'V', 'A', 'O', 'E', 'F', 'L', 'P', 'Z', 'J'};
        char [] blocksABC2 = {'O', 'K', 'Q', 'P', 'A', 'T', 'E', 'G', 'D', 'S', 'U', 'I', 'T', 'B', 'R', 'S', 'Y', 'C', 'M', 'W'};
        boolean[] blockUsed = new boolean[20];
        boolean flagOk = false;
        char[] word = sc.next().toUpperCase().toCharArray();
        for (char w : word) {
            /*
            --- código presentado en la entrevista ---
            for (int i = 0; i < blocksABC1.length; i++) {
                if ( (blocksABC1[i] == w || blocksABC2[i] == w) && !blockUsed[i]) {
                    blockUsed[i] = true;
                    flagOk = true;
                    break;
                }else{
                    flagOk = false;
                }
            }*/
            /* --- ajuste realizado para aceptar la palabra arlequin --- */
            for (int i = 0; i < blocksABC1.length; i++) {
                if ( blocksABC1[i] == w && !blockUsed[i]) {
                    blockUsed[i] = true;
                    flagOk = true;
                    break;
                }else{
                    flagOk = false;
                }
            }
            if (!flagOk) {
                for (int i = 0; i < blocksABC2.length; i++) {
                    if (blocksABC2[i] == w && !blockUsed[i]) {
                        blockUsed[i] = true;
                        flagOk = true;
                        break;
                    }
                    else{
                        flagOk = false;
                    }
                }
            }
        }
        System.out.println( String.format(">>> puedo_obtener_palabra(\"%s\"): %s", new String(word), flagOk ? "True" : "False" ) );
    }
}