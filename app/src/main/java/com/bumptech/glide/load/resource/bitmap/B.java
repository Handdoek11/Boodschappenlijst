package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d2.AbstractC5709k;

/* loaded from: classes.dex */
public final class B implements L1.c, L1.b {

    /* renamed from: o, reason: collision with root package name */
    private final Resources f12873o;

    /* renamed from: s, reason: collision with root package name */
    private final L1.c f12874s;

    private B(Resources resources, L1.c cVar) {
        this.f12873o = (Resources) AbstractC5709k.d(resources);
        this.f12874s = (L1.c) AbstractC5709k.d(cVar);
    }

    public static L1.c f(Resources resources, L1.c cVar) {
        if (cVar == null) {
            return null;
        }
        return new B(resources, cVar);
    }

    @Override // L1.b
    public void a() {
        L1.c cVar = this.f12874s;
        if (cVar instanceof L1.b) {
            ((L1.b) cVar).a();
        }
    }

    @Override // L1.c
    public void b() {
        this.f12874s.b();
    }

    @Override // L1.c
    public int c() {
        return this.f12874s.c();
    }

    @Override // L1.c
    public Class d() {
        return BitmapDrawable.class;
    }

    @Override // L1.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f12873o, (Bitmap) this.f12874s.get());
    }
}
