package de.tum.in.ase;

public class PenguinDNA {
    public static boolean checkChains(String chain1, String chain2) {
        //TODO: Check if two chains can bind to eachother
        boolean check = false;
        while(chain1.length() == chain2.length()) {
            for(int i = 0; i<chain1.length(); i++) {
                char checkChar1 = chain1.charAt(i);
                char checkChar2 = chain2.charAt(i);

                switch (checkChar1) {
                    case 'A': if(checkChar2 == 'T') { check = true;} else { check = false;};
                    case 'C': if(checkChar2 == 'G') { check = true;} else { check = false;};
                    case 'G': if(checkChar2 == 'C') { check = true;} else { check = false;};
                    case 'T': if(checkChar2 == 'A') { check = true;} else { check = false;};
                }
            }
        }
        return check;
    }

    public static String createMatchingChain(String chain1) {
        //TODO: Create a matching chain for chain1
        String chain2 = "";
        for(int i = 0; i<chain1.length(); i++){
            char matchChar1 = chain1.charAt(i);
            switch (matchChar1) {
                case 'A': chain2 = chain2 + "T";
                case 'C': chain2 = chain2 + "G";
                case 'G': chain2 = chain2 + "C";
                case 'T': chain2 = chain2 + "A";
            }

        }

        return chain2;
    }

    public static boolean isPenguinDNA(String chain1, String chain2, String sequence) {
        //TODO: Checking penguin DNA
      if((checkChains(chain1, chain2))&&(chain1.contains(sequence)^chain2.contains(sequence))) {
          return true;
      }
      else {
          return false;
      }
    }

}
