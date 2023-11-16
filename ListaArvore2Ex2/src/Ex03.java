import arvoreInt.ArvoreInt;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        ArvoreInt  arvore = new ArvoreInt();

        int[] vet = {12, 4, 16, 8, 2, 6};

        for(int i : vet){
            arvore.insert(i);
        }
        try{
            arvore.search(6);
            arvore.remove(12);  //retira a raiz da árvore
            System.out.println("Atravessamento posfixo:");
            arvore.postfixSearch();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
