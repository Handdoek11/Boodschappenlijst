package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import d2.AbstractC5709k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1077a implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final J1.j f12913a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f12914b;

    public C1077a(Resources resources, J1.j jVar) {
        this.f12914b = (Resources) AbstractC5709k.d(resources);
        this.f12913a = (J1.j) AbstractC5709k.d(jVar);
    }

    @Override // J1.j
    public L1.c a(Object obj, int i8, int i9, J1.h hVar) {
        return B.f(this.f12914b, this.f12913a.a(obj, i8, i9, hVar));
    }

    @Override // J1.j
    public boolean b(Object obj, J1.h hVar) {
        return this.f12913a.b(obj, hVar);
    }
}
