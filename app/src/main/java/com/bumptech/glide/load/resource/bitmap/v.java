package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class v implements J1.l {

    /* renamed from: b, reason: collision with root package name */
    private final J1.l f12954b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12955c;

    public v(J1.l lVar, boolean z7) {
        this.f12954b = lVar;
        this.f12955c = z7;
    }

    private L1.c d(Context context, L1.c cVar) {
        return B.f(context.getResources(), cVar);
    }

    @Override // J1.l
    public L1.c a(Context context, L1.c cVar, int i8, int i9) {
        M1.d f8 = com.bumptech.glide.b.c(context).f();
        Drawable drawable = (Drawable) cVar.get();
        L1.c a8 = u.a(f8, drawable, i8, i9);
        if (a8 != null) {
            L1.c a9 = this.f12954b.a(context, a8, i8, i9);
            if (!a9.equals(a8)) {
                return d(context, a9);
            }
            a9.b();
            return cVar;
        }
        if (!this.f12955c) {
            return cVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // J1.e
    public void b(MessageDigest messageDigest) {
        this.f12954b.b(messageDigest);
    }

    @Override // J1.e
    public boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f12954b.equals(((v) obj).f12954b);
        }
        return false;
    }

    @Override // J1.e
    public int hashCode() {
        return this.f12954b.hashCode();
    }

    public J1.l c() {
        return this;
    }
}
