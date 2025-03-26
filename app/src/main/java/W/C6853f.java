package w;

import java.util.Iterator;
import v.InterfaceC6821b;
import y6.AbstractC6977e;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6853f extends AbstractC6977e implements InterfaceC6821b {

    /* renamed from: s, reason: collision with root package name */
    private final C6849b f44172s;

    public C6853f(C6849b c6849b) {
        this.f44172s = c6849b;
    }

    @Override // y6.AbstractC6973a
    public int b() {
        return this.f44172s.size();
    }

    @Override // y6.AbstractC6973a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44172s.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C6854g(this.f44172s.l());
    }
}
