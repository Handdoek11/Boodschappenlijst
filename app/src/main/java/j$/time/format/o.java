package j$.time.format;

import j$.time.chrono.InterfaceC5882b;
import j$.time.w;

/* loaded from: classes3.dex */
final class o implements j$.time.temporal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC5882b f37118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f37119b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.n f37120c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f37121d;

    @Override // j$.time.temporal.o
    public final /* synthetic */ int k(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    o(InterfaceC5882b interfaceC5882b, j$.time.temporal.o oVar, j$.time.chrono.n nVar, w wVar) {
        this.f37118a = interfaceC5882b;
        this.f37119b = oVar;
        this.f37120c = nVar;
        this.f37121d = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.o, java.lang.Object] */
    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC5882b interfaceC5882b = this.f37118a;
        if (interfaceC5882b != null && rVar.v()) {
            return interfaceC5882b.f(rVar);
        }
        return this.f37119b.f(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.o, java.lang.Object] */
    @Override // j$.time.temporal.o
    public final j$.time.temporal.w n(j$.time.temporal.r rVar) {
        InterfaceC5882b interfaceC5882b = this.f37118a;
        if (interfaceC5882b != null && rVar.v()) {
            return interfaceC5882b.n(rVar);
        }
        return this.f37119b.n(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.o, java.lang.Object] */
    @Override // j$.time.temporal.o
    public final long s(j$.time.temporal.r rVar) {
        InterfaceC5882b interfaceC5882b = this.f37118a;
        if (interfaceC5882b != null && rVar.v()) {
            return interfaceC5882b.s(rVar);
        }
        return this.f37119b.s(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.o, java.lang.Object] */
    @Override // j$.time.temporal.o
    public final Object v(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return this.f37120c;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return this.f37121d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return this.f37119b.v(tVar);
        }
        return tVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.n nVar = this.f37120c;
        if (nVar != null) {
            str = " with chronology " + nVar;
        } else {
            str = "";
        }
        w wVar = this.f37121d;
        if (wVar != null) {
            str2 = " with zone " + wVar;
        }
        return this.f37119b + str + str2;
    }
}
