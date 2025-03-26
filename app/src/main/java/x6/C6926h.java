package x6;

import J6.AbstractC0650j;

/* renamed from: x6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6926h implements Comparable {

    /* renamed from: v, reason: collision with root package name */
    public static final a f44472v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final C6926h f44473w = C6927i.a();

    /* renamed from: o, reason: collision with root package name */
    private final int f44474o;

    /* renamed from: s, reason: collision with root package name */
    private final int f44475s;

    /* renamed from: t, reason: collision with root package name */
    private final int f44476t;

    /* renamed from: u, reason: collision with root package name */
    private final int f44477u;

    /* renamed from: x6.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public C6926h(int i8, int i9, int i10) {
        this.f44474o = i8;
        this.f44475s = i9;
        this.f44476t = i10;
        this.f44477u = c(i8, i9, i10);
    }

    private final int c(int i8, int i9, int i10) {
        if (new P6.i(0, 255).q(i8) && new P6.i(0, 255).q(i9) && new P6.i(0, 255).q(i10)) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6926h c6926h) {
        J6.r.e(c6926h, "other");
        return this.f44477u - c6926h.f44477u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C6926h c6926h = obj instanceof C6926h ? (C6926h) obj : null;
        return c6926h != null && this.f44477u == c6926h.f44477u;
    }

    public int hashCode() {
        return this.f44477u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f44474o);
        sb.append('.');
        sb.append(this.f44475s);
        sb.append('.');
        sb.append(this.f44476t);
        return sb.toString();
    }
}
