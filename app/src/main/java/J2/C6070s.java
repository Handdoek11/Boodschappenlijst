package j2;

import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5835i;
import h2.InterfaceC5837k;

/* renamed from: j2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6070s implements InterfaceC5835i {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6067p f38215a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38216b;

    /* renamed from: c, reason: collision with root package name */
    private final C5829c f38217c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5834h f38218d;

    /* renamed from: e, reason: collision with root package name */
    private final t f38219e;

    C6070s(AbstractC6067p abstractC6067p, String str, C5829c c5829c, InterfaceC5834h interfaceC5834h, t tVar) {
        this.f38215a = abstractC6067p;
        this.f38216b = str;
        this.f38217c = c5829c;
        this.f38218d = interfaceC5834h;
        this.f38219e = tVar;
    }

    @Override // h2.InterfaceC5835i
    public void a(AbstractC5830d abstractC5830d) {
        b(abstractC5830d, new InterfaceC5837k() { // from class: j2.r
            @Override // h2.InterfaceC5837k
            public final void a(Exception exc) {
                C6070s.e(exc);
            }
        });
    }

    @Override // h2.InterfaceC5835i
    public void b(AbstractC5830d abstractC5830d, InterfaceC5837k interfaceC5837k) {
        this.f38219e.a(AbstractC6066o.a().e(this.f38215a).c(abstractC5830d).f(this.f38216b).d(this.f38218d).b(this.f38217c).a(), interfaceC5837k);
    }

    AbstractC6067p d() {
        return this.f38215a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }
}
