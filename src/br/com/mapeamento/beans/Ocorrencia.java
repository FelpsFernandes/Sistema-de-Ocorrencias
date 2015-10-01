/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mapeamento.beans;

import java.sql.Date;
import java.sql.Time;

public class Ocorrencia {

    private long iDOcorrencia;
    private Date dataOcorrencia;
    private Time horaOcorrencia;
    private String tipoLogradouro;
    private String logradouro;
    private Bairro bairro;
    private Cidade Cidade;
    private UF uf;
    private String cep;
    private TipoOcorrencia tipoOcorrencia;
    

    public Ocorrencia(long iDOcorrencia, Date dataOcorrencia,
            Time horaOcorrencia, String tipoLogradouro, String logradouro,
            Bairro bairro, br.com.mapeamento.beans.Cidade cidade, UF uf,
            String cep, TipoOcorrencia tipoOcorrencia) {
        super();
        this.iDOcorrencia = iDOcorrencia;
        this.dataOcorrencia = dataOcorrencia;
        this.horaOcorrencia = horaOcorrencia;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.bairro = bairro;
        Cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.tipoOcorrencia = tipoOcorrencia;
    }

    public long getiDOcorrencia() {
        return iDOcorrencia;
    }

    public void setiDOcorrencia(long iDOcorrencia) {
        this.iDOcorrencia = iDOcorrencia;
    }

    public Date getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Date dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Time getHoraOcorrencia() {
        return horaOcorrencia;
    }

    public void setHoraOcorrencia(Time horaOcorrencia) {
        this.horaOcorrencia = horaOcorrencia;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade cidade) {
        Cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public TipoOcorrencia getTipoOcorrencia() {
        return tipoOcorrencia;
    }

    public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
        this.tipoOcorrencia = tipoOcorrencia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Cidade == null) ? 0 : Cidade.hashCode());
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result
                + ((dataOcorrencia == null) ? 0 : dataOcorrencia.hashCode());
        result = prime * result
                + ((horaOcorrencia == null) ? 0 : horaOcorrencia.hashCode());
        result = prime * result + (int) (iDOcorrencia ^ (iDOcorrencia >>> 32));
        result = prime * result
                + ((logradouro == null) ? 0 : logradouro.hashCode());
        result = prime * result
                + ((tipoLogradouro == null) ? 0 : tipoLogradouro.hashCode());
        result = prime * result
                + ((tipoOcorrencia == null) ? 0 : tipoOcorrencia.hashCode());
        result = prime * result + ((uf == null) ? 0 : uf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) obj;
        if (Cidade == null) {
            if (other.Cidade != null) {
                return false;
            }
        } else if (!Cidade.equals(other.Cidade)) {
            return false;
        }
        if (bairro == null) {
            if (other.bairro != null) {
                return false;
            }
        } else if (!bairro.equals(other.bairro)) {
            return false;
        }
        if (cep == null) {
            if (other.cep != null) {
                return false;
            }
        } else if (!cep.equals(other.cep)) {
            return false;
        }
        if (dataOcorrencia == null) {
            if (other.dataOcorrencia != null) {
                return false;
            }
        } else if (!dataOcorrencia.equals(other.dataOcorrencia)) {
            return false;
        }
        if (horaOcorrencia == null) {
            if (other.horaOcorrencia != null) {
                return false;
            }
        } else if (!horaOcorrencia.equals(other.horaOcorrencia)) {
            return false;
        }
        if (iDOcorrencia != other.iDOcorrencia) {
            return false;
        }
        if (logradouro == null) {
            if (other.logradouro != null) {
                return false;
            }
        } else if (!logradouro.equals(other.logradouro)) {
            return false;
        }
        if (tipoLogradouro == null) {
            if (other.tipoLogradouro != null) {
                return false;
            }
        } else if (!tipoLogradouro.equals(other.tipoLogradouro)) {
            return false;
        }
        if (tipoOcorrencia != other.tipoOcorrencia) {
            return false;
        }
        if (uf == null) {
            if (other.uf != null) {
                return false;
            }
        } else if (!uf.equals(other.uf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ocorrencia [iDOcorrencia=" + iDOcorrencia + ", dataOcorrencia="
                + dataOcorrencia + ", horaOcorrencia=" + horaOcorrencia
                + ", tipoLogradouro=" + tipoLogradouro + ", logradouro="
                + logradouro + ", bairro=" + bairro + ", Cidade=" + Cidade
                + ", uf=" + uf + ", cep=" + cep + ", tipoOcorrencia="
                + tipoOcorrencia + "]";
    }

}
