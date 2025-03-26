package x5;

import A6.g;
import I5.C0628b;
import I5.InterfaceC0637k;
import I6.q;
import J5.b;
import J6.r;
import io.ktor.utils.io.d;
import io.ktor.utils.io.f;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6911a extends b.c {

    /* renamed from: a, reason: collision with root package name */
    private final g f44450a;

    /* renamed from: b, reason: collision with root package name */
    private final q f44451b;

    /* renamed from: c, reason: collision with root package name */
    private final f f44452c;

    /* renamed from: d, reason: collision with root package name */
    private final b f44453d;

    public C6911a(b bVar, g gVar, q qVar) {
        f d8;
        r.e(bVar, "delegate");
        r.e(gVar, "callContext");
        r.e(qVar, "listener");
        this.f44450a = gVar;
        this.f44451b = qVar;
        if (bVar instanceof b.a) {
            d8 = d.a(((b.a) bVar).d());
        } else if (bVar instanceof b.AbstractC0058b) {
            d8 = f.f36863a.a();
        } else {
            if (!(bVar instanceof b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d8 = ((b.c) bVar).d();
        }
        this.f44452c = d8;
        this.f44453d = bVar;
    }

    @Override // J5.b
    public Long a() {
        return this.f44453d.a();
    }

    @Override // J5.b
    public C0628b b() {
        return this.f44453d.b();
    }

    @Override // J5.b
    public InterfaceC0637k c() {
        return this.f44453d.c();
    }

    @Override // J5.b.c
    public f d() {
        return G5.a.a(this.f44452c, this.f44450a, a(), this.f44451b);
    }
}
