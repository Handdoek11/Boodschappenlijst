package c4;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class S implements Iterator {
    protected S() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
