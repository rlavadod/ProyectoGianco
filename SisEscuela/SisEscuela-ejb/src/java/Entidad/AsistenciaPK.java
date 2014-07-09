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
public class AsistenciaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "idAsistencia")
    private int idAsistencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Alumno_idAlumno")
    private int alumnoidAlumno;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Curso_idCurso")
    private int cursoidCurso;

    public AsistenciaPK() {
    }

    public AsistenciaPK(int idAsistencia, int alumnoidAlumno, int cursoidCurso) {
        this.idAsistencia = idAsistencia;
        this.alumnoidAlumno = alumnoidAlumno;
        this.cursoidCurso = cursoidCurso;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
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
        hash += (int) idAsistencia;
        hash += (int) alumnoidAlumno;
        hash += (int) cursoidCurso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciaPK)) {
            return false;
        }
        AsistenciaPK other = (AsistenciaPK) object;
        if (this.idAsistencia != other.idAsistencia) {
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
        return "Entidad.AsistenciaPK[ idAsistencia=" + idAsistencia + ", alumnoidAlumno=" + alumnoidAlumno + ", cursoidCurso=" + cursoidCurso + " ]";
    }
    
}
