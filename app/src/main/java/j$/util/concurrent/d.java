package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class d extends AbstractC5896a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f37330b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f37322b;
        Object obj2 = lVar.f37323c;
        this.f37310j = lVar;
        a();
        return new k(obj, obj2, this.f37309i);
    }
}
