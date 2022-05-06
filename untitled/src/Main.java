import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //   String[][] Array = new String[5][5];
        System.out.println("Zadej počet válů");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        String[][] Array = {{"0", "0", "0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "1", "1", "1", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
        };

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                //  int random = (int) (Math.random() * 5);
                       /*  if (random % 2 == 0) {
                             Array[i][j] = "0";
                         } else {
                             Array[i][j] = "1";
                         }*/
                System.out.print(Array[i][j] + " | ");
                if ((j + 1) % Array.length == 0) {
                    System.out.println("");
                }
            }
        }
        String[][] Array2 = new String[5][5];
        for (int b = 0; b < val; b++) {
            for (int i = 0; i < Array.length; i++) {
                for (int j = 0; j < Array.length; j++) {
                    int AliveCellz = 0;
                    for (int k = -1; k < 1; k++) {
                        for (int l = -1; l < 1; l++) {
                            if (!(i + k < 0 || j + l < 0)) {
                                AliveCellz += Integer.parseInt(Array[i + k][j + l]);
                            }
                        }
                    }
                    AliveCellz = AliveCellz - Integer.parseInt(Array[i][j]);

                    if ((Array[i][j] == "1") && (AliveCellz < 2)) {
                        Array2[i][j] = "0";
                    }
                    else if ((Array[i][j] == "1") && (AliveCellz > 3)) {
                        Array2[i][j] = "0";
                    }
                    else if ((Array[i][j] == "0") && (AliveCellz == 3)) {
                        Array2[i][j] = "1";
                    }
                    else {
                        Array2[i][j] = Array[i][j];
                    }
                }
            }
                System.out.println("Novej vál " + val);
                for (int u = 0; u < Array2.length; u++) {
                    for (int j = 0; j < Array2.length; j++) {
                        System.out.print(Array2[u][j] + " | ");
                        if ((j + 1) % Array2.length == 0) {
                            System.out.println("");
                        }
                    }
                }
                Array = Array2;
                Array2 = new String[5][5];

            }


        }
    }

