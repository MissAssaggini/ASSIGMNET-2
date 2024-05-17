package jar;


public class RomanPrinter {
  

        static final String[] letteraI = {
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
        };
    
        static final String[] letteraV = {
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    "
        };
    
        static final String[] letteraX = {
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\"
        };
    
        static final String[] letteraL = {
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|"
        };
    
        static final String[] letteraC = {
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|"
        };
    
        static final String[] letteraD = {
            "  _____  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ "
        };
    
        static final String[] letteraM = {
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|"
        };
    
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        String sf[]={"","","","","",""};
        for(int i=0;i<(romanNumber.length());i=i+1){
            char l=romanNumber.charAt(i) ;
            
            switch(l){
                case 'I':
                    sf[0]+=letteraI[0];
                    sf[1]+=letteraI[1];
                    sf[2]+=letteraI[2];
                    sf[3]+=letteraI[3];
                    sf[4]+=letteraI[4];
                    sf[5]+=letteraI[5];
                    break;
                case 'V':
                    sf[0]+=letteraV[0];
                    sf[1]+=letteraV[1];
                    sf[2]+=letteraV[2];
                    sf[3]+=letteraV[3];
                    sf[4]+=letteraV[4];
                    sf[5]+=letteraV[5];
                    break;
                case 'X':
                    sf[0]+=letteraX[0];
                    sf[1]+=letteraX[1];
                    sf[2]+=letteraX[2];
                    sf[3]+=letteraX[3];
                    sf[4]+=letteraX[4];
                    sf[5]+=letteraX[5];
                    break;
                case 'L':
                    sf[0]+=letteraL[0];
                    sf[1]+=letteraL[1];
                    sf[2]+=letteraL[2];
                    sf[3]+=letteraL[3];
                    sf[4]+=letteraL[4];
                    sf[5]+=letteraL[5];
                    break;
                case 'C':
                    sf[0]+=letteraC[0];
                    sf[1]+=letteraC[1];
                    sf[2]+=letteraC[2];
                    sf[3]+=letteraC[3];
                    sf[4]+=letteraC[4];
                    sf[5]+=letteraC[5];
                    break;
                case 'D':
                    sf[0]+=letteraD[0];
                    sf[1]+=letteraD[1];
                    sf[2]+=letteraD[2];
                    sf[3]+=letteraD[3];
                    sf[4]+=letteraD[4];
                    sf[5]+=letteraD[5];
                    break;
                case 'M':
                    sf[0]+=letteraM[0];
                    sf[1]+=letteraM[1];
                    sf[2]+=letteraM[2];
                    sf[3]+=letteraM[3];
                    sf[4]+=letteraM[4];
                    sf[5]+=letteraM[5];
                    break;
                default :
                    throw new IllegalStateException("Lettera non valida");
                    
            }
        }
        
        return sf[0]+"\n"+sf[1]+"\n"+sf[2]+"\n"+sf[3]+"\n"+sf[4]+"\n"+sf[5];
    }
}



