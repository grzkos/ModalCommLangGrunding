package com.pwr.zpi;

import java.util.Map;
import java.util.Set;

/**
 * Describes object's observation with it's time, id and set of valuedTraits.
 * Represents observations placed in real world, witnessed by agent.
 */
@Deprecated
public class Observation {
    private Identifier identifier;
    private long time;
    //private Set<Trait> valuedTraits;
    Map<Trait, Boolean> valuedTraits;


    public Observation(Identifier identifier, Set<Trait> traits){
        this.identifier = identifier;
        this.valuedTraits = traits;
        time = System.currentTimeMillis();
    }

    public Observation(Identifier identifier, Set<Trait> traits, long time){
        this.identifier = identifier;
        this.valuedTraits = traits;
        this.time = time;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Set<Trait> getTraits() {
        return valuedTraits;
    }

    public void setTraits(Set<Trait> traits)
    {
        this.valuedTraits = traits;
    }

    /**
     * Returns type of object that this observation concern through finding its individual model.
     * @return Type of object or null when model not found.
     */
    public ObjectType getType(){
        return identifier.getType();
    }

}
