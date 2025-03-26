package V;

import J6.AbstractC0650j;
import J6.r;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int[] f5500a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f5501b;

    /* renamed from: c, reason: collision with root package name */
    private int f5502c;

    public c(int i8) {
        if (i8 == 0) {
            this.f5500a = a.f5488a;
            this.f5501b = a.f5489b;
        } else {
            this.f5500a = new int[i8];
            this.f5501b = new Object[i8 << 1];
        }
        this.f5502c = 0;
    }

    public final boolean a(Object obj) {
        return d(obj) >= 0;
    }

    public final Object b(Object obj) {
        int d8 = d(obj);
        if (d8 >= 0) {
            return this.f5501b[(d8 << 1) + 1];
        }
        return null;
    }

    protected final int c(Object obj, int i8) {
        int i9 = this.f5502c;
        if (i9 == 0) {
            return -1;
        }
        int a8 = a.a(this.f5500a, i9, i8);
        if (a8 < 0 || r.a(obj, this.f5501b[a8 << 1])) {
            return a8;
        }
        int i10 = a8 + 1;
        while (i10 < i9 && this.f5500a[i10] == i8) {
            if (r.a(obj, this.f5501b[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a8 - 1; i11 >= 0 && this.f5500a[i11] == i8; i11--) {
            if (r.a(obj, this.f5501b[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    protected final int e() {
        int i8 = this.f5502c;
        if (i8 == 0) {
            return -1;
        }
        int a8 = a.a(this.f5500a, i8, 0);
        if (a8 < 0 || this.f5501b[a8 << 1] == null) {
            return a8;
        }
        int i9 = a8 + 1;
        while (i9 < i8 && this.f5500a[i9] == 0) {
            if (this.f5501b[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a8 - 1; i10 >= 0 && this.f5500a[i10] == 0; i10--) {
            if (this.f5501b[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i8 = this.f5502c;
                if (i8 != cVar.f5502c) {
                    return false;
                }
                for (int i9 = 0; i9 < i8; i9++) {
                    Object g8 = g(i9);
                    Object h8 = h(i9);
                    Object b8 = cVar.b(g8);
                    if (h8 == null) {
                        if (b8 != null || !cVar.a(g8)) {
                            return false;
                        }
                    } else if (!r.a(h8, b8)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f5502c != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f5502c;
            for (int i11 = 0; i11 < i10; i11++) {
                Object g9 = g(i11);
                Object h9 = h(i11);
                Object obj2 = ((Map) obj).get(g9);
                if (h9 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(g9)) {
                        return false;
                    }
                } else if (!r.a(h9, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f5502c <= 0;
    }

    public final Object g(int i8) {
        return this.f5501b[i8 << 1];
    }

    public final Object h(int i8) {
        return this.f5501b[(i8 << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.f5500a;
        Object[] objArr = this.f5501b;
        int i8 = this.f5502c;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            Object obj = objArr[i9];
            i11 += (obj != null ? obj.hashCode() : 0) ^ iArr[i10];
            i10++;
            i9 += 2;
        }
        return i11;
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5502c * 28);
        sb.append('{');
        int i8 = this.f5502c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object g8 = g(i9);
            if (g8 != this) {
                sb.append(g8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object h8 = h(i9);
            if (h8 != this) {
                sb.append(h8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ c(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
