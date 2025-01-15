package one.digitalinnovation;

public class Pilha {

    private  No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public No top(){
        return  refNoEntradaPilha;
    }

    public boolean isEmpty(){
//        if(refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "----------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "------------------------\n";

        No noAuixiliar = refNoEntradaPilha;

        while (true){
            if(noAuixiliar != null){
                stringRetorno += "[No{dado=" + noAuixiliar.getDado() + "}]\n";
                noAuixiliar = noAuixiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "=============\n";
        return  stringRetorno;
    }
}
