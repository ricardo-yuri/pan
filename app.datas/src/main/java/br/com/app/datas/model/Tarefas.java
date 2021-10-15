package br.com.app.datas.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;

@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String tarefa;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataNascimentoCalendar;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;

    public Tarefas(){

    }

    public Tarefas(Long id, String tarefa, Calendar dataNascimentoCalendar, LocalDate date) {
        this.id = id;
        this.tarefa = tarefa;
        this.dataNascimentoCalendar = dataNascimentoCalendar;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public Calendar getDataNascimentoCalendar() {
        return dataNascimentoCalendar;
    }

    public void setDataNascimentoCalendar(Calendar dataNascimentoCalendar) {
        this.dataNascimentoCalendar = dataNascimentoCalendar;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
