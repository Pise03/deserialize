package com.decrypt;

import java.util.ArrayList;
import java.util.List;

public class root {
        private String annoDiInizio;
        private aula aula = new aula();
        private String classe;
        private String numeroFinestre;
        private String specializzazione;
        private List<element> studenti = new ArrayList<>();

        public String getAnnoDiInizio() {
                return this.annoDiInizio;
        }

        public void setAnnoDiInizio(String annoDiInizio) {
                this.annoDiInizio = annoDiInizio;
        }

        public aula getAula() {
                return this.aula;
        }

        public void setAula(aula aula) {
                this.aula = aula;
        }

        public String getClasse() {
                return this.classe;
        }

        public void setClasse(String classe) {
                this.classe = classe;
        }

        public String getNumeroFinestre() {
                return this.numeroFinestre;
        }

        public void setNumeroFinestre(String numeroFinestre) {
                this.numeroFinestre = numeroFinestre;
        }

        public String getSpecializzazione() {
                return this.specializzazione;
        }

        public void setSpecializzazione(String specializzazione) {
                this.specializzazione = specializzazione;
        }

        public List<element> getStudenti() {
                return this.studenti;
        }

        public void setStudenti(List<element> studenti) {
                this.studenti = studenti;
        }

}

