/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ruddy
 */
@Embeddable
public class NotasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idNotas")
    private int idNotas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Alumno_idAlumno")
    private int alumnoidAlumno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Curso_idCurso")
    private int cursoidCurso;

    public NotasPK() {
    }

    public NotasPK(int idNotas, int alumnoidAlumno, int cursoidCurso) {
        this.idNotas = idNotas;
        this.alumnoidAlumno = alumnoidAlumno;
        this.cursoidCurso = cursoidCurso;
    }

    public int getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(int idNotas) {
        this.idNotas = idNotas;
    }

    public int getAlumnoidAlumno() {
        return alumnoidAlumno;
    }

    public void setAlumnoidAlumno(int alumnoidAlumno) {
        this.alumnoidAlumno = alumnoidAlumno;
    }

    public int getCursoidCurso() {
        return cursoidCurso;
    }

    public void setCursoidCurso(int cursoidCurso) {
        this.cursoidCurso = cursoidCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idNotas;
        hash += (int) alumnoidAlumno;
        hash += (int) cursoidCurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotasPK)) {
            return false;
        }
        NotasPK other = (NotasPK) object;
        if (this.idNotas != other.idNotas) {
            return false;
        }
        if (this.alumnoidAlumno != other.alumnoidAlumno) {
            return false;
        }
        if (this.cursoidCurso != other.cursoidCurso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.NotasPK[ idNotas=" + idNotas + ", alumnoidAlumno=" + alumnoidAlumno + ", cursoidCurso=" + cursoidCurso + " ]";
    }
    
}
