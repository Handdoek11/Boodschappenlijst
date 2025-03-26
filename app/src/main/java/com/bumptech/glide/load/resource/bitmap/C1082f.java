package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.resource.bitmap.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082f implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final M1.d f12920a = new M1.e();

    @Override // J1.j
    public /* bridge */ /* synthetic */ L1.c a(Object obj, int i8, int i9, J1.h hVar) {
        return c(AbstractC1080d.a(obj), i8, i9, hVar);
    }

    @Override // J1.j
    public /* bridge */ /* synthetic */ boolean b(Object obj, J1.h hVar) {
        return d(AbstractC1080d.a(obj), hVar);
    }

    public L1.c c(ImageDecoder.Source source, int i8, int i9, J1.h hVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new R1.l(i8, i9, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i8 + "x" + i9 + "]");
        }
        return new C1083g(decodeBitmap, this.f12920a);
    }

    public boolean d(ImageDecoder.Source source, J1.h hVar) {
        return true;
    }
}
