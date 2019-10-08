package org.academiadecodigo.stringrays.sniper_elite.Object;

import org.academiadecodigo.stringrays.sniper_elite.GameObject;

public class Tree extends GameObject {

        private String message;

        @Override
        public abstract String getMessage() {
            return "I'm a tree! DO NOT SHOOT";
        }


}
