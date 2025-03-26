package q3;

import java.util.AbstractMap;

/* loaded from: classes.dex */
final class g7 extends P6 {

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ h7 f41704u;

    g7(h7 h7Var) {
        this.f41704u = h7Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        G1.a(i8, this.f41704u.f41723v, "index");
        h7 h7Var = this.f41704u;
        int i9 = i8 + i8;
        Object obj = h7Var.f41722u[i9];
        obj.getClass();
        Object obj2 = h7Var.f41722u[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41704u.f41723v;
    }
}
