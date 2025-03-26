package Q1;

import J1.h;
import P1.n;
import P1.o;
import P1.r;
import android.content.Context;
import android.net.Uri;
import c2.C0978b;

/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4669a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4670a;

        public a(Context context) {
            this.f4670a = context;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new b(this.f4670a);
        }
    }

    public b(Context context) {
        this.f4669a = context.getApplicationContext();
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, h hVar) {
        if (K1.b.e(i8, i9)) {
            return new n.a(new C0978b(uri), K1.c.f(this.f4669a, uri));
        }
        return null;
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return K1.b.b(uri);
    }
}
