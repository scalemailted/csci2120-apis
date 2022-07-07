package MetalShopAPI.Interfaces;
/**
 * @Author Mitchell Mennelle
 * @version 1.0
 * @since 6/20/22
 *
 *An interface for an item that can be stacked.
 *
 */
public interface Stackable {
    public void stack(Stackable add);
}
