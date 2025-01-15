package com.projeto.projetoreferecia;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }

    public  void setNum(int i){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
