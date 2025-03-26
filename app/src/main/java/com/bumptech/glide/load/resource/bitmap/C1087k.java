package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087k implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final C1082f f12924a = new C1082f();

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(ByteBuffer byteBuffer, int i8, int i9, J1.h hVar) {
        return this.f12924a.c(ImageDecoder.createSource(byteBuffer), i8, i9, hVar);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, J1.h hVar) {
        return true;
    }
}
