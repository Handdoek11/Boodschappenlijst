package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f12927a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final n f12928b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final n f12929c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final n f12930d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final n f12931e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f12932f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f12933g;

    /* renamed from: h, reason: collision with root package name */
    public static final J1.g f12934h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f12935i;

    private static class a extends n {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            if (Math.min(i9 / i11, i8 / i10) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends n {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            int ceil = (int) Math.ceil(Math.max(i9 / i11, i8 / i10));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    private static class c extends n {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return b(i8, i9, i10, i11) == 1.0f ? g.QUALITY : n.f12929c.a(i8, i9, i10, i11);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            return Math.min(1.0f, n.f12929c.b(i8, i9, i10, i11));
        }
    }

    private static class d extends n {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            return Math.max(i10 / i8, i11 / i9);
        }
    }

    private static class e extends n {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return n.f12935i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            if (n.f12935i) {
                return Math.min(i10 / i8, i11 / i9);
            }
            if (Math.max(i9 / i11, i8 / i10) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    private static class f extends n {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public g a(int i8, int i9, int i10, int i11) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.n
        public float b(int i8, int i9, int i10, int i11) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f12931e = dVar;
        f12932f = new f();
        f12933g = dVar;
        f12934h = J1.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f12935i = true;
    }

    public abstract g a(int i8, int i9, int i10, int i11);

    public abstract float b(int i8, int i9, int i10, int i11);
}
