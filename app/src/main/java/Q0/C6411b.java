package q0;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6411b {

    /* renamed from: e, reason: collision with root package name */
    public static final C6411b f40896e = new C6411b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f40897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40900d;

    /* renamed from: q0.b$a */
    static class a {
        static Insets a(int i8, int i9, int i10, int i11) {
            return Insets.of(i8, i9, i10, i11);
        }
    }

    private C6411b(int i8, int i9, int i10, int i11) {
        this.f40897a = i8;
        this.f40898b = i9;
        this.f40899c = i10;
        this.f40900d = i11;
    }

    public static C6411b a(C6411b c6411b, C6411b c6411b2) {
        return b(Math.max(c6411b.f40897a, c6411b2.f40897a), Math.max(c6411b.f40898b, c6411b2.f40898b), Math.max(c6411b.f40899c, c6411b2.f40899c), Math.max(c6411b.f40900d, c6411b2.f40900d));
    }

    public static C6411b b(int i8, int i9, int i10, int i11) {
        return (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f40896e : new C6411b(i8, i9, i10, i11);
    }

    public static C6411b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C6411b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f40897a, this.f40898b, this.f40899c, this.f40900d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6411b.class != obj.getClass()) {
            return false;
        }
        C6411b c6411b = (C6411b) obj;
        return this.f40900d == c6411b.f40900d && this.f40897a == c6411b.f40897a && this.f40899c == c6411b.f40899c && this.f40898b == c6411b.f40898b;
    }

    public int hashCode() {
        return (((((this.f40897a * 31) + this.f40898b) * 31) + this.f40899c) * 31) + this.f40900d;
    }

    public String toString() {
        return "Insets{left=" + this.f40897a + ", top=" + this.f40898b + ", right=" + this.f40899c + ", bottom=" + this.f40900d + '}';
    }
}
