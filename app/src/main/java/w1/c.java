package W1;

import J1.h;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.C1083g;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final M1.d f5811a;

    /* renamed from: b, reason: collision with root package name */
    private final e f5812b;

    /* renamed from: c, reason: collision with root package name */
    private final e f5813c;

    public c(M1.d dVar, e eVar, e eVar2) {
        this.f5811a = dVar;
        this.f5812b = eVar;
        this.f5813c = eVar2;
    }

    @Override // W1.e
    public L1.c a(L1.c cVar, h hVar) {
        Drawable drawable = (Drawable) cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f5812b.a(C1083g.f(((BitmapDrawable) drawable).getBitmap(), this.f5811a), hVar);
        }
        if (drawable instanceof V1.c) {
            return this.f5813c.a(b(cVar), hVar);
        }
        return null;
    }

    private static L1.c b(L1.c cVar) {
        return cVar;
    }
}
