package com.buda.mariobros.sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by buda on 8/21/16.
 */
public class Coin extends InteractiveTile{
    public Coin(World world, TiledMap map, Rectangle bounds){
        super(world, map, bounds);

    }
}
