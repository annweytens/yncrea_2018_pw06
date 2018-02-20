package yncrea.pw06.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CalEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date start;

    private Date end;

    private String title;

    private String color;

    private String description;


    public CalEvent() {
    }


    public CalEvent(final Date start, final Date end, final String title, final String color, final String description) {
        this.start = start;
        this.end = end;
        this.title = title;
        this.color = color;
        this.description = description;
    }


    public long getId() {
        return id;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(final String titleValue) {
        title = titleValue;
    }


    public String getColor() {
        return color;
    }


    public void setColor(final String colorValue) {
        color = colorValue;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(final String descriptionValue) {
        description = descriptionValue;
    }


}
