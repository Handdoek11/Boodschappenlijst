package Q1;

import P1.h;
import P1.n;
import P1.o;
import P1.r;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f4690a;

    public static class a implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }
    }

    public g(n nVar) {
        this.f4690a = nVar;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(URL url, int i8, int i9, J1.h hVar) {
        return this.f4690a.a(new h(url), i8, i9, hVar);
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
