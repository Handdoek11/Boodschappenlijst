package c1;

import g1.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class c implements e, g1.d {

    /* renamed from: z, reason: collision with root package name */
    static final TreeMap f12097z = new TreeMap();

    /* renamed from: o, reason: collision with root package name */
    private volatile String f12098o;

    /* renamed from: s, reason: collision with root package name */
    final long[] f12099s;

    /* renamed from: t, reason: collision with root package name */
    final double[] f12100t;

    /* renamed from: u, reason: collision with root package name */
    final String[] f12101u;

    /* renamed from: v, reason: collision with root package name */
    final byte[][] f12102v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f12103w;

    /* renamed from: x, reason: collision with root package name */
    final int f12104x;

    /* renamed from: y, reason: collision with root package name */
    int f12105y;

    private c(int i8) {
        this.f12104x = i8;
        int i9 = i8 + 1;
        this.f12103w = new int[i9];
        this.f12099s = new long[i9];
        this.f12100t = new double[i9];
        this.f12101u = new String[i9];
        this.f12102v = new byte[i9][];
    }

    public static c f(String str, int i8) {
        TreeMap treeMap = f12097z;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
                if (ceilingEntry == null) {
                    c cVar = new c(i8);
                    cVar.g(str, i8);
                    return cVar;
                }
                treeMap.remove(ceilingEntry.getKey());
                c cVar2 = (c) ceilingEntry.getValue();
                cVar2.g(str, i8);
                return cVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void h() {
        TreeMap treeMap = f12097z;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i8 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i8;
        }
    }

    @Override // g1.d
    public void F(int i8, double d8) {
        this.f12103w[i8] = 3;
        this.f12100t[i8] = d8;
    }

    @Override // g1.d
    public void O(int i8, long j8) {
        this.f12103w[i8] = 2;
        this.f12099s[i8] = j8;
    }

    @Override // g1.d
    public void R(int i8, byte[] bArr) {
        this.f12103w[i8] = 5;
        this.f12102v[i8] = bArr;
    }

    @Override // g1.e
    public void d(g1.d dVar) {
        for (int i8 = 1; i8 <= this.f12105y; i8++) {
            int i9 = this.f12103w[i8];
            if (i9 == 1) {
                dVar.f0(i8);
            } else if (i9 == 2) {
                dVar.O(i8, this.f12099s[i8]);
            } else if (i9 == 3) {
                dVar.F(i8, this.f12100t[i8]);
            } else if (i9 == 4) {
                dVar.w(i8, this.f12101u[i8]);
            } else if (i9 == 5) {
                dVar.R(i8, this.f12102v[i8]);
            }
        }
    }

    @Override // g1.e
    public String e() {
        return this.f12098o;
    }

    @Override // g1.d
    public void f0(int i8) {
        this.f12103w[i8] = 1;
    }

    void g(String str, int i8) {
        this.f12098o = str;
        this.f12105y = i8;
    }

    public void i() {
        TreeMap treeMap = f12097z;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12104x), this);
            h();
        }
    }

    @Override // g1.d
    public void w(int i8, String str) {
        this.f12103w[i8] = 4;
        this.f12101u[i8] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
