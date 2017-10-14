package net.mobilim.NaviGateData.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_CABIN_DECK")
public class CategoryCabinDeck extends BaseEntity {


    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CABIN_DECK_ID")
    private CabinDeck cabinDeck;

    public CategoryCabinDeck() {
        super();
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }

    public CabinDeck getCabinDeck() {
        return cabinDeck;
    }

    public void setCabinDeck(CabinDeck cabinDeck) {
        this.cabinDeck = cabinDeck;
    }
}
