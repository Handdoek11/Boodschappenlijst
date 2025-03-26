package c4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1001d implements InterfaceC0992A {
    AbstractC1001d() {
    }

    @Override // c4.InterfaceC0992A
    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return AbstractC0993B.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
