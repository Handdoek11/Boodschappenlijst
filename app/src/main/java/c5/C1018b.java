package c5;

import Z2.AbstractC0777p;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1018b {

    /* renamed from: a, reason: collision with root package name */
    private final int f12236a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12237b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12238c;

    /* renamed from: c5.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f12239a = 0;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12240b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12241c;

        public C1018b a() {
            return new C1018b(this.f12239a, this.f12240b, this.f12241c, null);
        }

        public a b() {
            this.f12241c = true;
            return this;
        }

        public a c(int i8, int... iArr) {
            this.f12239a = i8;
            for (int i9 : iArr) {
                this.f12239a = i9 | this.f12239a;
            }
            return this;
        }
    }

    /* synthetic */ C1018b(int i8, boolean z7, boolean z8, AbstractC1020d abstractC1020d) {
        this.f12236a = i8;
        this.f12237b = z7;
        this.f12238c = z8;
    }

    public final int a() {
        return this.f12236a;
    }

    public final boolean b() {
        return this.f12238c;
    }

    public final boolean c() {
        return this.f12237b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1018b)) {
            return false;
        }
        C1018b c1018b = (C1018b) obj;
        return this.f12236a == c1018b.f12236a && this.f12237b == c1018b.f12237b && this.f12238c == c1018b.f12238c;
    }

    public int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f12236a), Boolean.valueOf(this.f12237b), Boolean.valueOf(this.f12238c));
    }
}
