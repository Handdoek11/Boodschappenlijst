package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class C implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f12875a;

    public C(t tVar) {
        this.f12875a = tVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(ParcelFileDescriptor parcelFileDescriptor, int i8, int i9, J1.h hVar) {
        return this.f12875a.d(parcelFileDescriptor, i8, i9, hVar);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, J1.h hVar) {
        return e(parcelFileDescriptor) && this.f12875a.o(parcelFileDescriptor);
    }
}
