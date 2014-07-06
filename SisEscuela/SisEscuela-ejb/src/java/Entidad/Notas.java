/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ruddy
 */
@Entity
@Table(name = "notas")
@NamedQueries({
    @NamedQuery(name = "Notas.findAll", query = "SELECT n FROM Notas n")})
public class Notas implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotasPK notasPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nota")
    private BigDecimal nota;
    @JoinColumn(name = "Curso_idCurso", referencedColumnName = "idCurso", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;
    @JoinColumn(name = "Alumno_idAlumno", referencedColumnName = "idAlumno", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;

    public Notas() {
    }

    public Notas(NotasPK notasPK) {
        this.notasPK = notasPK;
    }

    public Notas(NotasPK notasPK, BigDecimal nota) {
        this.notasPK = notasPK;
        this.nota = nota;
    }

    public Notas(int idNotas, int alumnoidAlumno, int cursoidCurso) {
        this.notasPK = new NotasPK(idNotas, alumnoidAlumno, cursoidCurso);
    }

    public NotasPK getNotasPK() {
        return notasPK;
    }

    public void setNotasPK(NotasPK notasPK) {
        this.notasPK = notasPK;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notasPK != null ? notasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notas)) {
            return false;
        }
        Notas other = (Notas) object;
        if ((this.notasPK == null && other.notasPK != null) || (this.notasPK != null && !this.notasPK.equals(other.notasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Notas[ notasPK=" + notasPK + " ]";
    }
    
}
