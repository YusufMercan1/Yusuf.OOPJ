public interface Vätska  { // Interface har jag använt här eftersom alla växter har något gemensamt som vätskan som växterna får.

    double räknaVätskeBehov(); //här använder jag polymorfism då alla växter kommer att implemetera denna metod
    Vätsketyp getVätsketyp();

public enum Vätsketyp {
        KRANVATTEN("kranvatten"),     //Här används enum för bestämda värden
        MINERALVATTEN("mineralvatten"),
        PROTEINDRYCK("proteindryck");

        private final String beskrivning;

        Vätsketyp(String beskrivning) {
            this.beskrivning = beskrivning;
        }

        public String getBeskrivning() {
            return beskrivning;
        }
    }

}
