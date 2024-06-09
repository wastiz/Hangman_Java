package models;

public class Model {
    private final String chooseCategory = "Kõik kategooriad";
    /**
     * See on vaikimisi andmebaasi fail kui käsurealt uut ei leotud. Andmebaasi tabelit nimed ja struktuurid peavad
     * samad olema, kuid andmed võivad erinevad olla.
     *  hangman_words_ee.db - Eestikeelsed sõnad, edetabel on tühi
     *  hangman_words_en.db - Inglisekeelsed sõnad, edetabel on tühi
     *  hangman_words_ee_test.db - Eestikeelsed sõnad, edetabel EI ole tühi
     */
    private String databaseFile = "hangman_words_ee_test.db";

    public Model() {
        new Database(this); // Loome andmebaasi ühenduse
    }

    /**
     * Rippmenüü esimene valik enne kategooriaid
     * @return teksti "Kõik kategooriad"
     */
    public String getChooseCategory() {
        return chooseCategory;
    }

    /**
     * Millise andmebaasiga on tegemist
     * @return andmebaasi failinimi
     */
    public String getDatabaseFile() {
        return databaseFile;
    }

    /**
     * Seadistab uue andmebaasi failinime, kui see saadi käsurealt
     * @param databaseFile uus andmebaasi failinimi
     */
    public void setDatabaseFile(String databaseFile) {
        this.databaseFile = databaseFile;
    }
}
