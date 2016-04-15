package dcll.fsim;

/**
 * Created by 21506032 on 14/04/2016.
 */
public class Item {

    /**
     * Object : la valeur de l'objet.
     */
    private Object value;

    /**
     * Constructeur.
     * @param lvalue la valeur à assigner connard.
     */
    Item(final Object lvalue) {
        setValue(lvalue);
    }

    /**
     * Fonction qui retourne la valeur de l'objet.
     * @return value
     */
    public final Object getValue() {
        return value;
    }

    /**
     * Set la valeur de l'objet.
     * @param lvalue la valeur à assigner connard.
     */
    public final void setValue(final Object lvalue) {
        this.value = lvalue;
    }
}
