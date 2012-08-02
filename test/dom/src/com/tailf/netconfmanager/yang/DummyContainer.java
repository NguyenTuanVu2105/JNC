/*    -*- Java -*-
 *
 *  Copyright 2012 Tail-F Systems AB. All rights reserved.
 *
 *  This software is the confidential and proprietary
 *  information of Tail-F Systems AB.
 *
 *  $Id$
 *
 */

package com.tailf.netconfmanager.yang;

import com.tailf.netconfmanager.*;

class DummyContainer extends Container {

    private static final long serialVersionUID = 1L;

    /**
     * Structure information. An array of the children names.
     */
    protected String[] childrenNames() {
        return new String[0];
    }

    /**
     * Structure information. An array of the names of the key children.
     */
    protected String[] keyNames() {
        return new String[0];
    }

    /**
     * Clones this object, returning an exact copy.
     * 
     * @return A clone of the object.
     */
    public Object clone() {
        try {
            return (DummyContainer) cloneContent(new DummyContainer(namespace,
                    name));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Clones this object, returning a shallow copy.
     * 
     * @return A clone of the object. Children are not included.
     */
    protected Element cloneShallow() {
        try {
            return cloneShallowContent(new DummyContainer(namespace, name));
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Constructor for the container
     */
    public DummyContainer(String ns, String name) {
        super(ns, name);
        setDefaultPrefix();
    }
}