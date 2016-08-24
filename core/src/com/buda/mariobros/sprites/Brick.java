package com.buda.mariobros.sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by buda on 8/21/16.
 */
public class Brick extends InteractiveTile {

    public Brick(World world, TiledMap map, Rectangle rect) {
        super(world, map, rect);
    }
}
