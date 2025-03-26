package q3;

import java.util.List;

/* renamed from: q3.p6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6554p6 extends P6 {

    /* renamed from: u, reason: collision with root package name */
    final transient int f42212u;

    /* renamed from: v, reason: collision with root package name */
    final transient int f42213v;

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ P6 f42214w;

    C6554p6(P6 p62, int i8, int i9) {
        this.f42214w = p62;
        this.f42212u = i8;
        this.f42213v = i9;
    }

    @Override // q3.M4
    final int c() {
        return this.f42214w.d() + this.f42212u + this.f42213v;
    }

    @Override // q3.M4
    final int d() {
        return this.f42214w.d() + this.f42212u;
    }

    @Override // q3.M4
    final Object[] e() {
        return this.f42214w.e();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        G1.a(i8, this.f42213v, "index");
        return this.f42214w.get(i8 + this.f42212u);
    }

    @Override // q3.P6
    /* renamed from: j */
    public final P6 subList(int i8, int i9) {
        G1.c(i8, i9, this.f42213v);
        P6 p62 = this.f42214w;
        int i10 = this.f42212u;
        return p62.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42213v;
    }

    @Override // q3.P6, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
