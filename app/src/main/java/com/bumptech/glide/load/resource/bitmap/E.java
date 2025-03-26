package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class E implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final T1.l f12887a;

    /* renamed from: b, reason: collision with root package name */
    private final M1.d f12888b;

    public E(T1.l lVar, M1.d dVar) {
        this.f12887a = lVar;
        this.f12888b = dVar;
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(Uri uri, int i8, int i9, J1.h hVar) {
        L1.c a8 = this.f12887a.a(uri, i8, i9, hVar);
        if (a8 == null) {
            return null;
        }
        return u.a(this.f12888b, (Drawable) a8.get(), i8, i9);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, J1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
