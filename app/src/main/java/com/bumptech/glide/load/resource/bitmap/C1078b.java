package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1078b implements J1.k {

    /* renamed from: a, reason: collision with root package name */
    private final M1.d f12915a;

    /* renamed from: b, reason: collision with root package name */
    private final J1.k f12916b;

    public C1078b(M1.d dVar, J1.k kVar) {
        this.f12915a = dVar;
        this.f12916b = kVar;
    }

    @Override // J1.k
    public J1.c b(J1.h hVar) {
        return this.f12916b.b(hVar);
    }

    @Override // J1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(L1.c cVar, File file, J1.h hVar) {
        return this.f12916b.a(new C1083g(((BitmapDrawable) cVar.get()).getBitmap(), this.f12915a), file, hVar);
    }
}
