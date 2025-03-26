package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1085i implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f12923a;

    public C1085i(t tVar) {
        this.f12923a = tVar;
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(ByteBuffer byteBuffer, int i8, int i9, J1.h hVar) {
        return this.f12923a.g(byteBuffer, i8, i9, hVar);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, J1.h hVar) {
        return this.f12923a.q(byteBuffer);
    }
}
