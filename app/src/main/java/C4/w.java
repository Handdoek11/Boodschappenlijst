package c4;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class w {

    class a extends S {

        /* renamed from: o, reason: collision with root package name */
        boolean f12231o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f12232s;

        a(Object obj) {
            this.f12232s = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f12231o;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f12231o) {
                throw new NoSuchElementException();
            }
            this.f12231o = true;
            return this.f12232s;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        b4.h.i(collection);
        b4.h.i(it);
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= collection.add(it.next());
        }
        return z7;
    }

    public static boolean b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !b4.f.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static S c(Object obj) {
        return new a(obj);
    }
}
