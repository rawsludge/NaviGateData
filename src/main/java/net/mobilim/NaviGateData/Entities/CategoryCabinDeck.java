package net.mobilim.NaviGateData.Entities;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_CABIN_DECK")
public class CategoryCabinDeck extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
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
