public class forNormalEmVetor {
     
        public static void main(String[] args) {
    
            int n[] = { 11, 22, 3, 41, 54, 66 };
    
            System.out.println("Total de indices do vetor são: " + n.length);
    
            System.out.println("");
    
            for (int c = 0; c < n.length - 1; c++) {
                System.out.println("Na posição " + c + " temos o valor: " + n[c]);
            }
        }
}
