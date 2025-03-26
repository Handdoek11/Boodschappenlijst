package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import d2.AbstractC5710l;

/* loaded from: classes.dex */
public final class I implements J1.j {

    private static final class a implements L1.c {

        /* renamed from: o, reason: collision with root package name */
        private final Bitmap f12901o;

        a(Bitmap bitmap) {
            this.f12901o = bitmap;
        }

        @Override // L1.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f12901o;
        }

        @Override // L1.c
        public void b() {
        }

        @Override // L1.c
        public int c() {
            return AbstractC5710l.h(this.f12901o);
        }

        @Override // L1.c
        public Class d() {
            return Bitmap.class;
        }
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(Bitmap bitmap, int i8, int i9, J1.h hVar) {
        return new a(bitmap);
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, J1.h hVar) {
        return true;
    }
}
