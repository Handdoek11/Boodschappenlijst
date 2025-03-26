package j4;

import H4.a;
import androidx.appcompat.app.E;
import o4.n;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private final H4.a f38251a;

    public l(H4.a aVar) {
        this.f38251a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, H4.b bVar) {
        E.a(bVar.get());
        throw null;
    }

    public void c(n nVar) {
        if (nVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(nVar);
            this.f38251a.a(new a.InterfaceC0048a() { // from class: j4.k
                @Override // H4.a.InterfaceC0048a
                public final void a(H4.b bVar) {
                    l.b(eVar, bVar);
                }
            });
        }
    }
}
