package org.academiadecodigo.stringrays.sniper.objects.destroyables;

public interface Destroyable {

    void hit(int damage);

    boolean isDestroyed();
}
