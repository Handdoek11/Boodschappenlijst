package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import d2.AbstractC5709k;
import d2.AbstractC5710l;

/* renamed from: com.bumptech.glide.load.resource.bitmap.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1083g implements L1.c, L1.b {

    /* renamed from: o, reason: collision with root package name */
    private final Bitmap f12921o;

    /* renamed from: s, reason: collision with root package name */
    private final M1.d f12922s;

    public C1083g(Bitmap bitmap, M1.d dVar) {
        this.f12921o = (Bitmap) AbstractC5709k.e(bitmap, "Bitmap must not be null");
        this.f12922s = (M1.d) AbstractC5709k.e(dVar, "BitmapPool must not be null");
    }

    public static C1083g f(Bitmap bitmap, M1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1083g(bitmap, dVar);
    }

    @Override // L1.b
    public void a() {
        this.f12921o.prepareToDraw();
    }

    @Override // L1.c
    public void b() {
        this.f12922s.c(this.f12921o);
    }

    @Override // L1.c
    public int c() {
        return AbstractC5710l.h(this.f12921o);
    }

    @Override // L1.c
    public Class d() {
        return Bitmap.class;
    }

    @Override // L1.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f12921o;
    }
}
