package Q1;

import J1.h;
import P1.n;
import P1.o;
import P1.r;
import android.content.Context;
import android.net.Uri;
import c2.C0978b;
import com.bumptech.glide.load.resource.bitmap.K;

/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4671a;

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f4672a;

        public a(Context context) {
            this.f4672a = context;
        }

        @Override // P1.o
        public n d(r rVar) {
            return new c(this.f4672a);
        }
    }

    public c(Context context) {
        this.f4671a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l8 = (Long) hVar.c(K.f12902d);
        return l8 != null && l8.longValue() == -1;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(Uri uri, int i8, int i9, h hVar) {
        if (K1.b.e(i8, i9) && e(hVar)) {
            return new n.a(new C0978b(uri), K1.c.g(this.f4671a, uri));
        }
        return null;
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return K1.b.d(uri);
    }
}
