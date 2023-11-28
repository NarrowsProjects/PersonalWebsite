package application.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "worry")
public class Worry {
    @Id
    private int id;
    private String name, type, explanation,  title;
    private Date date;
    public Worry() {
        id=1;
        this.name="name";
        this.date=new Date();
        this.type="type";
        this.title="title";
        this.type = "type";
        this.explanation = "explanation";
    }

    public Worry(Date date,String name,String type,String explanation, String title) {
        id=1;
        this.name=name;
        this.date=date;
        this.type=type;
        this.title=title;
        this.type = type;
        this.explanation = explanation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
