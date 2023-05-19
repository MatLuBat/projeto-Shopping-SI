public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano){
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && ano >=1900){
            if (dia <=31 && dia > 0){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && ano >=1900) {
            if (dia <=30 && dia > 0){
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else if (mes == 2) {
                if (dia > 0 && dia <=28 && ano >=1900){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                } else if ((ano%4)==0 && dia >0 && dia <=29 && ano >=1900){
                    this.dia = dia;
                    this.mes = mes;
                    this.ano = ano;
                } else {
                    System.out.println("Digite uma data válida!");
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }

            }

        }

    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public boolean verificaAnoBissexto(){
        if (ano%4==0){
            return true;
        }else {
            return false;
        }
    }
}
