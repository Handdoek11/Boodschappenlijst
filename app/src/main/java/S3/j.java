package s3;

import java.util.List;

/* loaded from: classes2.dex */
final class j extends k {

    /* renamed from: t, reason: collision with root package name */
    final transient int f42720t;

    /* renamed from: u, reason: collision with root package name */
    final transient int f42721u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ k f42722v;

    j(k kVar, int i8, int i9) {
        this.f42722v = kVar;
        this.f42720t = i8;
        this.f42721u = i9;
    }

    @Override // s3.AbstractC6731h
    final int c() {
        return this.f42722v.d() + this.f42720t + this.f42721u;
    }

    @Override // s3.AbstractC6731h
    final int d() {
        return this.f42722v.d() + this.f42720t;
    }

    @Override // s3.AbstractC6731h
    final Object[] e() {
        return this.f42722v.e();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC6728e.a(i8, this.f42721u, "index");
        return this.f42722v.get(i8 + this.f42720t);
    }

    @Override // s3.k
    /* renamed from: j */
    public final k subList(int i8, int i9) {
        AbstractC6728e.c(i8, i9, this.f42721u);
        k kVar = this.f42722v;
        int i10 = this.f42720t;
        return kVar.subList(i8 + i10, i9 + i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f42721u;
    }

    @Override // s3.k, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }
}
