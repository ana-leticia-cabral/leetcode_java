class Solution {

    public String makeFancyString(String s) {

        s = s.toLowerCase();
        while (true) {
            String[] fancyString = s.split("");
            StringBuilder sB = new StringBuilder();
            boolean removido = false;

            for (int i = 0; i < fancyString.length; i++) {
                if (i + 2 < fancyString.length) {
                    if (fancyString[i].equals(fancyString[i + 1])) {
                        sB.append(fancyString[i]);
                        sB.append(fancyString[i + 1]);

                        if (fancyString[i + 1].equals(fancyString[i + 2])) {
                            i += 2;
                            removido = true;
                        } else {
                            i += 1;
                        }
                    } else {
                        sB.append(fancyString[i]);
                    }
                } else {
                    sB.append(fancyString[i]);
                }
             
            }
            if(!removido){
                break;
            }
            String novaString = sB.toString();
            s = novaString;
        }
    return s;
    }
}