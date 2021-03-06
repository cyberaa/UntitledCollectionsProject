/* with
 char|byte|short|int|long|float|double|obj elem
 Mutable|Immutable mutability
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

package net.openhft.collect.impl.hash;

import net.openhft.collect.*;
import net.openhft.collect.impl.InternalCharCollectionOps;
import net.openhft.function.*;
import net.openhft.collect.impl.NotGenerated;

import net.openhft.collect.set.CharSet;
import javax.annotation.Nonnull;

import java.util.*;


public abstract class MutableCharDHashGO/*<>*/ extends MutableCharDHashSO/*<>*/ {

    public void forEach(Consumer<? super Character> action) {
        /* template ForEach */
    }

    /* if !(object elem) */
    public void forEach(CharConsumer action) {
        /* template ForEach */
    }
    /* endif */

    public boolean forEachWhile(
            /* if !(obj elem) */CharPredicate/*elif obj elem //Predicate// endif *//*<super>*/
            predicate) {
        /* template ForEachWhile */ throw new NotGenerated(); /* endtemplate */
    }

    public boolean allContainingIn(CharCollection/*<?>*/ c) {
        /* template AllContainingIn */ throw new NotGenerated(); /* endtemplate */
    }

    /* if float|double elem */
    boolean allContainingIn(InternalCharCollectionOps c) {
        /* template AllContainingIn with internal version */throw new NotGenerated();/*endtemplate*/
    }
    /* endif */

    public boolean reverseAddAllTo(CharCollection/*<super>*/ c) {
        /* template ReverseAddAllTo */ throw new NotGenerated(); /* endtemplate */
    }

    /* if float|double elem */
    boolean reverseAddAllTo(InternalCharCollectionOps c) {
        /* template ReverseAddAllTo with internal version */throw new NotGenerated();/*endtemplate*/
    }
    /* endif */

    public boolean reverseRemoveAllFrom(CharSet/*<?>*/ s) {
        /* template ReverseRemoveAllFrom */ throw new NotGenerated(); /* endtemplate */
    }

    /* if float|double elem */
    boolean reverseRemoveAllFrom(InternalCharCollectionOps s) {
        /* template ReverseRemoveAllFrom with internal version */ throw new NotGenerated();
        /* endtemplate */
    }
    /* endif */


    public CharIterator/*<>*/ iterator() {
        /* if Mutable mutability //
        if (!noRemoved()) return new SomeRemovedIterator();
        // endif */
        return new NoRemovedIterator();
    }

    public CharCursor/*<>*/ setCursor() {
        /* if Mutable mutability //
        if (!noRemoved()) return new SomeRemovedCursor();
        // endif */
        return new NoRemovedCursor();
    }

    @Nonnull
    public Object[] toArray() {
        /* template ToArray with generic version */ throw new NotGenerated(); /* endtemplate */
    }

    @SuppressWarnings("unchecked")
    @Nonnull
    public <T> T[] toArray(@Nonnull T[] a) {
        /* template ToTypedArray */ throw new NotGenerated(); /* endtemplate */
    }

    /* if !(obj elem) */
    @Nonnull
    public char[] toCharArray() {
        /* template ToArray */ throw new NotGenerated(); /* endtemplate */
    }

    @Nonnull
    public char[] toArray(char[] a) {
        /* template ToPrimitiveArray */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */


    public int setHashCode() {
        /* template SetHashCode */ throw new NotGenerated(); /* endtemplate */
    }

    public String setToString() {
        /* template ToString */ throw new NotGenerated(); /* endtemplate */
    }


    public boolean removeIf(Predicate<? super Character> filter) {
        /* template RemoveIf */ throw new NotGenerated(); /* endtemplate */
    }

    /* if !(obj elem) */
    public boolean removeIf(CharPredicate filter) {
        /* template RemoveIf */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */

    public boolean removeAll(@Nonnull Collection<?> c) {
        /* template RemoveAll with generic version */ throw new NotGenerated(); /* endtemplate */
    }

    /* if !(obj elem) */
    boolean removeAll(@Nonnull CharCollection c) {
        /* template RemoveAll */ throw new NotGenerated(); /* endtemplate */
    }

    /* if float|double elem */
    boolean removeAll(@Nonnull InternalCharCollectionOps c) {
        /* template RemoveAll with internal version */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */
    /* endif */

    public boolean retainAll(@Nonnull Collection<?> c) {
        /* if !(obj elem) */
        if (c instanceof CharCollection)
            return retainAll((CharCollection) c);
        /* endif */
        /* template RetainAll with generic version */ throw new NotGenerated(); /* endtemplate */
    }

    /* if !(obj elem) */
    private boolean retainAll(@Nonnull CharCollection c) {
        /* template RetainAll */ throw new NotGenerated(); /* endtemplate */
    }

    /* if float|double elem */
    private boolean retainAll(@Nonnull InternalCharCollectionOps c) {
        /* template RetainAll with internal version */ throw new NotGenerated(); /* endtemplate */
    }
    /* endif */
    /* endif */


    /* with No|Some removed */
    /* if !(Immutable mutability Some removed) */

    class NoRemovedIterator implements CharIterator/*<>*/ {
        /* template Iterator.fields */

        NoRemovedIterator() {
            /* template Iterator.constructor */
        }

        /* if !(obj elem) */
        @Override
        public char nextChar() {
            /* template Iterator.next */ throw new NotGenerated(); /* endtemplate */
        }
        /* endif */

        /* if obj elem || JDK8 jdk //@Override// endif */
        public void forEachRemaining(Consumer<? super Character> action) {
            /* template Iterator.forEachRemaining */ throw new NotGenerated(); /* endtemplate */
        }

        /* if !(obj elem) */
        @Override
        public void forEachRemaining(CharConsumer action) {
            /* template Iterator.forEachRemaining */ throw new NotGenerated(); /* endtemplate */
        }
        /* endif */

        @Override
        public boolean hasNext() {
            /* template Iterator.hasNext */ throw new NotGenerated(); /* endtemplate */
        }

        @Override
        public Character next() {
            /* if !(obj elem) */
            return nextChar();
            /* elif obj elem */
            /* template Iterator.next */
            /* endif */
        }

        @Override
        public void remove() {
            /* template Iterator.remove */ throw new NotGenerated(); /* endtemplate */
        }
    }


    class NoRemovedCursor implements CharCursor/*<>*/ {
        /* template Cursor.fields */

        NoRemovedCursor() {
            /* template Cursor.constructor */
        }

        @Override
        public void forEachForward(/*f*/CharConsumer action) {
            /* template Cursor.forEachForward */ throw new NotGenerated(); /* endtemplate */
        }

        @Override
        public char elem() {
            /* template Cursor.elem */ throw new NotGenerated(); /* endtemplate */
        }

        @Override
        public boolean moveNext() {
            /* template Cursor.moveNext */ throw new NotGenerated(); /* endtemplate */
        }

        @Override
        public void remove() {
            /* template Cursor.remove */ throw new NotGenerated(); /* endtemplate */
        }
    }

    /* endif */
    /* endwith */
}
