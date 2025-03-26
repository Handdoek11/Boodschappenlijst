package C3;

import A3.AbstractC0376j;
import B3.AbstractC0389h;
import B3.C0401u;
import B3.InterfaceC0388g;
import Z2.AbstractC0778q;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.b;

/* loaded from: classes2.dex */
public final class O extends AbstractC0389h {

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC0388g f891k;

    public O(Context context, b.a aVar) {
        super(context, aVar);
        this.f891k = new K();
    }

    @Override // B3.AbstractC0389h
    public final AbstractC0376j A(Uri uri, int i8) {
        return AbstractC0778q.a(this.f891k.a(g(), uri, i8), new L());
    }

    @Override // B3.AbstractC0389h
    public final AbstractC0376j B(C0401u c0401u) {
        com.google.android.gms.common.api.c g8 = g();
        return AbstractC0778q.a(g8.a(new E((K) this.f891k, g8, c0401u)), new AbstractC0778q.a() { // from class: C3.N
            @Override // Z2.AbstractC0778q.a
            public final Object a(W2.f fVar) {
                return ((InterfaceC0388g.a) fVar).N();
            }
        });
    }

    @Override // B3.AbstractC0389h
    public final AbstractC0376j y(Uri uri) {
        return AbstractC0778q.a(((K) this.f891k).b(g(), uri, 0), new AbstractC0778q.a() { // from class: C3.M
            @Override // Z2.AbstractC0778q.a
            public final Object a(W2.f fVar) {
                return Integer.valueOf(((InterfaceC0388g.c) fVar).j0());
            }
        });
    }

    @Override // B3.AbstractC0389h
    public final AbstractC0376j z() {
        com.google.android.gms.common.api.c g8 = g();
        return AbstractC0778q.a(g8.a(new F((K) this.f891k, g8)), new L());
    }
}
