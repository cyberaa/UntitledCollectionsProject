/* with
 char|byte|short|int|long|float|double|obj key
 short|byte|char|int|long|float|double|obj value
*/
/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.collect.map.hash;

import net.openhft.function.*;

import java.util.Map;
import java.util.ServiceLoader;


public final class HashCharShortMaps {

    /* define oo */
    /* if obj key obj value //<Object, Object>// elif obj key || obj value //<Object>// endif */
    /* enddefine */

    private static final ServiceLoader<HashCharShortMapFactory> LOADER =
            ServiceLoader.load(HashCharShortMapFactory.class);
    private static HashCharShortMapFactory/*oo*/ defaultFactory = null;

    public static HashCharShortMapFactory/*oo*/ getDefaultFactory() {
        if (defaultFactory != null) {
            return defaultFactory;
        } else {
            // synchronization?
            return defaultFactory = LOADER.iterator().next();
        }
    }

    /* define ek */
    /* if obj key //? extends K// elif !(obj key) //Character// endif */
    /* enddefine */

    /* define ev */
    /* if obj value //? extends V// elif !(obj value) //Short// endif */
    /* enddefine */

    /* define ep //<// ek //, // ev //>// enddefine */

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap() {
        return getDefaultFactory().newMutableMap();
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(int expectedSize) {
        return getDefaultFactory().newMutableMap();
    }

    /* with Mutable|Immutable mutability */
    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map) {
        return getDefaultFactory().newMutableMap(map);
    }

    /* if obj key */
    /**
     * If the specified map has the same key equivalence with this factory,
     * {@code expectedSize} is ignored.
     */
    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map,
            int expectedSize) {
        return getDefaultFactory().newMutableMap(map, expectedSize);
    }
    /* endif */

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            Consumer</*f*/CharShortConsumer/*<>*/> entriesSupplier) {
        return getDefaultFactory().newMutableMap(entriesSupplier);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            Consumer</*f*/CharShortConsumer/*<>*/> entriesSupplier, int expectedSize) {
        return getDefaultFactory().newMutableMap(entriesSupplier, expectedSize);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            char[] keys, short[] values) {
        return getDefaultFactory().newMutableMap(keys, values);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            char[] keys, short[] values, int expectedSize) {
        return getDefaultFactory().newMutableMap(keys, values, expectedSize);
    }

    /* if !(obj key obj value) */
    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            Character[] keys, Short[] values) {
        return getDefaultFactory().newMutableMap(keys, values);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(
            Character[] keys, Short[] values, int expectedSize) {
        return getDefaultFactory().newMutableMap(keys, values, expectedSize);
    }
    /* endif */

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values) {
        return getDefaultFactory().newMutableMap(keys, values);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values, int expectedSize) {
        return getDefaultFactory().newMutableMap(keys, values, expectedSize);
    }


    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMapOf(
            char k1, short v1) {
        return getDefaultFactory().newMutableMapOf(k1, v1);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMapOf(
            char k1, short v1, char k2, short v2) {
        return getDefaultFactory().newMutableMapOf(k1, v1, k2, v2);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMapOf(
            char k1, short v1, char k2, short v2,
            char k3, short v3) {
        return getDefaultFactory().newMutableMapOf(k1, v1, k2, v2, k3, v3);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMapOf(
            char k1, short v1, char k2, short v2,
            char k3, short v3, char k4, short v4) {
        return getDefaultFactory().newMutableMapOf(k1, v1, k2, v2, k3, v3, k4, v4);
    }

    public static /*<>*/ HashCharShortMap/*<>*/ newMutableMapOf(
            char k1, short v1, char k2, short v2,
            char k3, short v3, char k4, short v4,
            char k5, short v5) {
        return getDefaultFactory().newMutableMapOf(k1, v1, k2, v2, k3, v3, k4, v4, k5, v5);
    }
    /* endwith */

    private HashCharShortMaps() {}
}
