package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.D;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final D f12638a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final M1.b f12639a;

        public a(M1.b bVar) {
            this.f12639a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f12639a);
        }
    }

    public k(InputStream inputStream, M1.b bVar) {
        D d8 = new D(inputStream, bVar);
        this.f12638a = d8;
        d8.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f12638a.f();
    }

    public void c() {
        this.f12638a.e();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f12638a.reset();
        return this.f12638a;
    }
}
