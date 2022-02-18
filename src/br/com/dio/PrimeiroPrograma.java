package br.com.dio;

import br.com.dio.model.Gato;

import javax.swing.*;
import java.util.Objects;

public class PrimeiroPrograma {
    public void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("A volta dos que não foram", 300);
        System.out.println(livro1);
        /*int a =5;
        int b = 3;
        System.out.println("Hello Word "+(a+b));*/
    }
    static class Livro{
        private String nome;
        private  Integer pag;

        public Livro(String nome, Integer pag) {
            this.nome = nome;
            this.pag = pag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getPag() {
            return pag;
        }

        public void setPag(Integer pag) {
            this.pag = pag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", pag=" + pag +
                    '}';
        }
    }
}
