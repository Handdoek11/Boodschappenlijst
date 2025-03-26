package r3;

import java.util.AbstractMap;

/* renamed from: r3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6701t extends AbstractC6695m {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ C6702u f42593u;

    C6701t(C6702u c6702u) {
        this.f42593u = c6702u;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        AbstractC6685c.a(i8, this.f42593u.f42596v, "index");
        C6702u c6702u = this.f42593u;
        int i9 = i8 + i8;
        Object obj = c6702u.f42595u[i9];
        obj.getClass();
        Object obj2 = c6702u.f42595u[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42593u.f42596v;
    }
}
