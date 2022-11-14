package model;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name = "tb_agencias")
public class AgenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private int distanciaX;
    private int distanciaY;


    //one to many
    private double localizacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDistanciaX() {
        return distanciaX;
    }

    public void setDistanciaX(int distanciaX) {
        this.distanciaX = distanciaX;
    }

    public int getDistanciaY() {
        return distanciaY;
    }

    public void setDistanciaY(int distanciaY) {
        this.distanciaY = distanciaY;
    }

    public double getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
    }
}


