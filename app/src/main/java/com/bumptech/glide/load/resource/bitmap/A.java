package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import d2.AbstractC5699a;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class A implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final C1082f f12872a = new C1082f();

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(InputStream inputStream, int i8, int i9, J1.h hVar) {
        return this.f12872a.c(ImageDecoder.createSource(AbstractC5699a.b(inputStream)), i8, i9, hVar);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, J1.h hVar) {
        return true;
    }
}
