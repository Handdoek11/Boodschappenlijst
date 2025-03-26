package V1;

import J1.l;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1083g;
import d2.AbstractC5709k;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements l {

    /* renamed from: b, reason: collision with root package name */
    private final l f5527b;

    public f(l lVar) {
        this.f5527b = (l) AbstractC5709k.d(lVar);
    }

    @Override // J1.l
    public L1.c a(Context context, L1.c cVar, int i8, int i9) {
        c cVar2 = (c) cVar.get();
        L1.c c1083g = new C1083g(cVar2.e(), com.bumptech.glide.b.c(context).f());
        L1.c a8 = this.f5527b.a(context, c1083g, i8, i9);
        if (!c1083g.equals(a8)) {
            c1083g.b();
        }
        cVar2.m(this.f5527b, (Bitmap) a8.get());
        return cVar;
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        this.f5527b.b(messageDigest);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f5527b.equals(((f) obj).f5527b);
        }
        return false;
    }

    @Override // J1.e
    public int hashCode() {
        return this.f5527b.hashCode();
    }
}
