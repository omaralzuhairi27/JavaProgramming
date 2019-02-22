package week12.Heroes;

public class RailFenceCipher {


    public char[][] encryptText(Integer key, String text) {
        char[][] rail = new char[key][text.length()];
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < text.length(); j++) {
                rail[i][j] = ' ';
            }
        }

        int row = 0;
        int check = 0;

        for (int column = 0; column < text.length(); column++) {
            if (check == 0) {
                rail[row][column] = text.charAt(column);
                row++;
                if (row == key) {
                    check = 1;
                    row--;
                }
            } else if (check == 1) {
                row--;
                rail[row][column] = text.charAt(column);
                if (row == 0) {
                    check = 0;
                    row = 1;
                }
            }
        }
        return rail;
    }
    public String decryptText(char[][] encryptet){
        String decryptet="";
        Integer check=0;
        Integer row=0;
        for (int i = 0; i <encryptet.length ; i++) {
            if(check==0){
                decryptet=decryptet+encryptet[row][i];
                row++;
                if(row==null){
                    check=1;
                    row--;
                }
            }else if (check==1){
                row--;
                decryptet=decryptet+encryptet[row][i];
                if (row == 0) {
                    check = 0;
                    row = 1;
                }

            }

        }
        return decryptet;
    }

}

