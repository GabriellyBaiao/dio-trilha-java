package one.digitalinovation;

import java.util.Objects;

public class CarroHash {

    String marca;

    public CarroHash(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroHash carro = (CarroHash) o;
//        return Objects.equals(marca, carro.marca);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }
}
