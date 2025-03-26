package P1;

import P1.n;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class y implements n {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f4395b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final n f4396a;

    public static class a implements o {
        @Override // P1.o
        public n d(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }
    }

    public y(n nVar) {
        this.f4396a = nVar;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, J1.h hVar) {
        return this.f4396a.a(new h(uri.toString()), i8, i9, hVar);
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f4395b.contains(uri.getScheme());
    }
}
