package h6;

import f6.c;

/* renamed from: h6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5844b {

    /* renamed from: a, reason: collision with root package name */
    static final c f36277a = new a();

    /* renamed from: h6.b$a */
    static final class a implements c {
        a() {
        }

        @Override // f6.c
        public boolean a(Object obj, Object obj2) {
            return AbstractC5844b.c(obj, obj2);
        }
    }

    public static int a(int i8, int i9) {
        if (i8 < i9) {
            return -1;
        }
        return i8 > i9 ? 1 : 0;
    }

    public static int b(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 > j9 ? 1 : 0;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static c d() {
        return f36277a;
    }

    public static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int f(int i8, String str) {
        if (i8 > 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i8);
    }
}
