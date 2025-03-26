package s1;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static j f42683a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final int f42684b = 20;

    public static class a extends j {

        /* renamed from: c, reason: collision with root package name */
        private int f42685c;

        public a(int i8) {
            super(i8);
            this.f42685c = i8;
        }

        @Override // s1.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f42685c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // s1.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f42685c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // s1.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f42685c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // s1.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f42685c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // s1.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f42685c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public j(int i8) {
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            try {
                if (f42683a == null) {
                    f42683a = new a(3);
                }
                jVar = f42683a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static synchronized void e(j jVar) {
        synchronized (j.class) {
            f42683a = jVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i8 = f42684b;
        if (length >= i8) {
            sb.append(str.substring(0, i8));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
