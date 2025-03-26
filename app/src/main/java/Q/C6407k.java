package q;

import J6.AbstractC0650j;
import J6.r;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import r.AbstractC6640a;
import y6.AbstractC6980h;

/* renamed from: q.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6407k {

    /* renamed from: o, reason: collision with root package name */
    private int[] f40887o;

    /* renamed from: s, reason: collision with root package name */
    private Object[] f40888s;

    /* renamed from: t, reason: collision with root package name */
    private int f40889t;

    public C6407k() {
        this(0, 1, null);
    }

    private final int d(Object obj, int i8) {
        int i9 = this.f40889t;
        if (i9 == 0) {
            return -1;
        }
        int a8 = AbstractC6640a.a(this.f40887o, i9, i8);
        if (a8 < 0 || r.a(obj, this.f40888s[a8 << 1])) {
            return a8;
        }
        int i10 = a8 + 1;
        while (i10 < i9 && this.f40887o[i10] == i8) {
            if (r.a(obj, this.f40888s[i10 << 1])) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a8 - 1; i11 >= 0 && this.f40887o[i11] == i8; i11--) {
            if (r.a(obj, this.f40888s[i11 << 1])) {
                return i11;
            }
        }
        return ~i10;
    }

    private final int f() {
        int i8 = this.f40889t;
        if (i8 == 0) {
            return -1;
        }
        int a8 = AbstractC6640a.a(this.f40887o, i8, 0);
        if (a8 < 0 || this.f40888s[a8 << 1] == null) {
            return a8;
        }
        int i9 = a8 + 1;
        while (i9 < i8 && this.f40887o[i9] == 0) {
            if (this.f40888s[i9 << 1] == null) {
                return i9;
            }
            i9++;
        }
        for (int i10 = a8 - 1; i10 >= 0 && this.f40887o[i10] == 0; i10--) {
            if (this.f40888s[i10 << 1] == null) {
                return i10;
            }
        }
        return ~i9;
    }

    public final int a(Object obj) {
        int i8 = this.f40889t * 2;
        Object[] objArr = this.f40888s;
        if (obj == null) {
            for (int i9 = 1; i9 < i8; i9 += 2) {
                if (objArr[i9] == null) {
                    return i9 >> 1;
                }
            }
            return -1;
        }
        for (int i10 = 1; i10 < i8; i10 += 2) {
            if (r.a(obj, objArr[i10])) {
                return i10 >> 1;
            }
        }
        return -1;
    }

    public void b(int i8) {
        int i9 = this.f40889t;
        int[] iArr = this.f40887o;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, i8);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40887o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40888s, i8 * 2);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40888s = copyOf2;
        }
        if (this.f40889t != i9) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f40889t > 0) {
            this.f40887o = AbstractC6640a.f42380a;
            this.f40888s = AbstractC6640a.f42382c;
            this.f40889t = 0;
        }
        if (this.f40889t > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C6407k) {
                if (size() != ((C6407k) obj).size()) {
                    return false;
                }
                C6407k c6407k = (C6407k) obj;
                int i8 = this.f40889t;
                for (int i9 = 0; i9 < i8; i9++) {
                    Object g8 = g(i9);
                    Object k8 = k(i9);
                    Object obj2 = c6407k.get(g8);
                    if (k8 == null) {
                        if (obj2 != null || !c6407k.containsKey(g8)) {
                            return false;
                        }
                    } else if (!r.a(k8, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i10 = this.f40889t;
            for (int i11 = 0; i11 < i10; i11++) {
                Object g9 = g(i11);
                Object k9 = k(i11);
                Object obj3 = ((Map) obj).get(g9);
                if (k9 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g9)) {
                        return false;
                    }
                } else if (!r.a(k9, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object g(int i8) {
        if (i8 >= 0 && i8 < this.f40889t) {
            return this.f40888s[i8 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public Object get(Object obj) {
        int e8 = e(obj);
        if (e8 >= 0) {
            return this.f40888s[(e8 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int e8 = e(obj);
        return e8 >= 0 ? this.f40888s[(e8 << 1) + 1] : obj2;
    }

    public void h(C6407k c6407k) {
        r.e(c6407k, "map");
        int i8 = c6407k.f40889t;
        b(this.f40889t + i8);
        if (this.f40889t != 0) {
            for (int i9 = 0; i9 < i8; i9++) {
                put(c6407k.g(i9), c6407k.k(i9));
            }
        } else if (i8 > 0) {
            AbstractC6980h.e(c6407k.f40887o, this.f40887o, 0, 0, i8);
            AbstractC6980h.g(c6407k.f40888s, this.f40888s, 0, 0, i8 << 1);
            this.f40889t = i8;
        }
    }

    public int hashCode() {
        int[] iArr = this.f40887o;
        Object[] objArr = this.f40888s;
        int i8 = this.f40889t;
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

    public Object i(int i8) {
        int i9;
        if (i8 < 0 || i8 >= (i9 = this.f40889t)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        Object[] objArr = this.f40888s;
        int i10 = i8 << 1;
        Object obj = objArr[i10 + 1];
        if (i9 <= 1) {
            clear();
        } else {
            int i11 = i9 - 1;
            int[] iArr = this.f40887o;
            if (iArr.length <= 8 || i9 >= iArr.length / 3) {
                if (i8 < i11) {
                    int i12 = i8 + 1;
                    AbstractC6980h.e(iArr, iArr, i8, i12, i9);
                    Object[] objArr2 = this.f40888s;
                    AbstractC6980h.g(objArr2, objArr2, i10, i12 << 1, i9 << 1);
                }
                Object[] objArr3 = this.f40888s;
                int i13 = i11 << 1;
                objArr3[i13] = null;
                objArr3[i13 + 1] = null;
            } else {
                int i14 = i9 > 8 ? i9 + (i9 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i14);
                r.d(copyOf, "copyOf(this, newSize)");
                this.f40887o = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f40888s, i14 << 1);
                r.d(copyOf2, "copyOf(this, newSize)");
                this.f40888s = copyOf2;
                if (i9 != this.f40889t) {
                    throw new ConcurrentModificationException();
                }
                if (i8 > 0) {
                    AbstractC6980h.e(iArr, this.f40887o, 0, 0, i8);
                    AbstractC6980h.g(objArr, this.f40888s, 0, 0, i10);
                }
                if (i8 < i11) {
                    int i15 = i8 + 1;
                    AbstractC6980h.e(iArr, this.f40887o, i8, i15, i9);
                    AbstractC6980h.g(objArr, this.f40888s, i10, i15 << 1, i9 << 1);
                }
            }
            if (i9 != this.f40889t) {
                throw new ConcurrentModificationException();
            }
            this.f40889t = i11;
        }
        return obj;
    }

    public boolean isEmpty() {
        return this.f40889t <= 0;
    }

    public Object j(int i8, Object obj) {
        if (i8 < 0 || i8 >= this.f40889t) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
        }
        int i9 = (i8 << 1) + 1;
        Object[] objArr = this.f40888s;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public Object k(int i8) {
        if (i8 >= 0 && i8 < this.f40889t) {
            return this.f40888s[(i8 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i8).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i8 = this.f40889t;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d8 = obj != null ? d(obj, hashCode) : f();
        if (d8 >= 0) {
            int i9 = (d8 << 1) + 1;
            Object[] objArr = this.f40888s;
            Object obj3 = objArr[i9];
            objArr[i9] = obj2;
            return obj3;
        }
        int i10 = ~d8;
        int[] iArr = this.f40887o;
        if (i8 >= iArr.length) {
            int i11 = 8;
            if (i8 >= 8) {
                i11 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i11 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i11);
            r.d(copyOf, "copyOf(this, newSize)");
            this.f40887o = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f40888s, i11 << 1);
            r.d(copyOf2, "copyOf(this, newSize)");
            this.f40888s = copyOf2;
            if (i8 != this.f40889t) {
                throw new ConcurrentModificationException();
            }
        }
        if (i10 < i8) {
            int[] iArr2 = this.f40887o;
            int i12 = i10 + 1;
            AbstractC6980h.e(iArr2, iArr2, i12, i10, i8);
            Object[] objArr2 = this.f40888s;
            AbstractC6980h.g(objArr2, objArr2, i12 << 1, i10 << 1, this.f40889t << 1);
        }
        int i13 = this.f40889t;
        if (i8 == i13) {
            int[] iArr3 = this.f40887o;
            if (i10 < iArr3.length) {
                iArr3[i10] = hashCode;
                Object[] objArr3 = this.f40888s;
                int i14 = i10 << 1;
                objArr3[i14] = obj;
                objArr3[i14 + 1] = obj2;
                this.f40889t = i13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int e8 = e(obj);
        if (e8 >= 0) {
            return i(e8);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int e8 = e(obj);
        if (e8 >= 0) {
            return j(e8, obj2);
        }
        return null;
    }

    public int size() {
        return this.f40889t;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f40889t * 28);
        sb.append('{');
        int i8 = this.f40889t;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object g8 = g(i9);
            if (g8 != sb) {
                sb.append(g8);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k8 = k(i9);
            if (k8 != sb) {
                sb.append(k8);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        r.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6407k(int i8) {
        this.f40887o = i8 == 0 ? AbstractC6640a.f42380a : new int[i8];
        this.f40888s = i8 == 0 ? AbstractC6640a.f42382c : new Object[i8 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int e8 = e(obj);
        if (e8 < 0 || !r.a(obj2, k(e8))) {
            return false;
        }
        i(e8);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int e8 = e(obj);
        if (e8 < 0 || !r.a(obj2, k(e8))) {
            return false;
        }
        j(e8, obj3);
        return true;
    }

    public /* synthetic */ C6407k(int i8, int i9, AbstractC0650j abstractC0650j) {
        this((i9 & 1) != 0 ? 0 : i8);
    }

    public C6407k(C6407k c6407k) {
        this(0, 1, null);
        if (c6407k != null) {
            h(c6407k);
        }
    }
}
