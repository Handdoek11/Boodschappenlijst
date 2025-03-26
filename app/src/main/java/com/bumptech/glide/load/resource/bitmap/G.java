package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.t;
import d2.C5702d;
import d2.C5707i;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class G implements J1.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f12891a;

    /* renamed from: b, reason: collision with root package name */
    private final M1.b f12892b;

    static class a implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final D f12893a;

        /* renamed from: b, reason: collision with root package name */
        private final C5702d f12894b;

        a(D d8, C5702d c5702d) {
            this.f12893a = d8;
            this.f12894b = c5702d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.t.b
        public void a() {
            this.f12893a.e();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.t.b
        public void b(M1.d dVar, Bitmap bitmap) {
            IOException d8 = this.f12894b.d();
            if (d8 != null) {
                if (bitmap == null) {
                    throw d8;
                }
                dVar.c(bitmap);
                throw d8;
            }
        }
    }

    public G(t tVar, M1.b bVar) {
        this.f12891a = tVar;
        this.f12892b = bVar;
    }

    @Override // J1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public L1.c a(InputStream inputStream, int i8, int i9, J1.h hVar) {
        boolean z7;
        D d8;
        if (inputStream instanceof D) {
            d8 = (D) inputStream;
            z7 = false;
        } else {
            z7 = true;
            d8 = new D(inputStream, this.f12892b);
        }
        C5702d e8 = C5702d.e(d8);
        try {
            return this.f12891a.f(new C5707i(e8), i8, i9, hVar, new a(d8, e8));
        } finally {
            e8.f();
            if (z7) {
                d8.f();
            }
        }
    }

    @Override // J1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, J1.h hVar) {
        return this.f12891a.p(inputStream);
    }
}
