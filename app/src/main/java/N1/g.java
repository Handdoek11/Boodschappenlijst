package N1;

import N1.h;
import d2.C5706h;

/* loaded from: classes.dex */
public class g extends C5706h implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f4071e;

    public g(long j8) {
        super(j8);
    }

    @Override // N1.h
    public void a(int i8) {
        if (i8 >= 40) {
            b();
        } else if (i8 >= 20 || i8 == 15) {
            m(h() / 2);
        }
    }

    @Override // N1.h
    public /* bridge */ /* synthetic */ L1.c c(J1.e eVar, L1.c cVar) {
        return (L1.c) super.k(eVar, cVar);
    }

    @Override // N1.h
    public void d(h.a aVar) {
        this.f4071e = aVar;
    }

    @Override // N1.h
    public /* bridge */ /* synthetic */ L1.c e(J1.e eVar) {
        return (L1.c) super.l(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d2.C5706h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(L1.c cVar) {
        return cVar == null ? super.i(null) : cVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d2.C5706h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(J1.e eVar, L1.c cVar) {
        h.a aVar = this.f4071e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.a(cVar);
    }
}
