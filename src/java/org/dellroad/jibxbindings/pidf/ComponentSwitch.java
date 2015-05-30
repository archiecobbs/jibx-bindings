
/*
 * Copyright (C) 2010 Archie L. Cobbs. All rights reserved.
 */

package org.dellroad.jibxbindings.pidf;

/**
 * Visitor pattern interface for {@link Component} classes.
 */
public interface ComponentSwitch {

    void caseTuple(Tuple tuple);
    void casePerson(Person person);
    void caseDevice(Device device);
}

