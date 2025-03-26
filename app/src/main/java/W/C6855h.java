package w;

import java.util.Iterator;
import v.InterfaceC6820a;
import y6.AbstractC6973a;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6855h extends AbstractC6973a implements InterfaceC6820a {

    /* renamed from: o, reason: collision with root package name */
    private final C6849b f44173o;

    public C6855h(C6849b c6849b) {
        this.f44173o = c6849b;
    }

    @Override // y6.AbstractC6973a
    public int b() {
        return this.f44173o.size();
    }

    @Override // y6.AbstractC6973a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f44173o.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C6856i(this.f44173o.l());
    }
}
