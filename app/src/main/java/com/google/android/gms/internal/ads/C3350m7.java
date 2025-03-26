package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3350m7 implements H6 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3241l7 f24462c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f24460a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f24461b = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f24463d = 5242880;

    public C3350m7(InterfaceC3241l7 interfaceC3241l7, int i8) {
        this.f24462c = interfaceC3241l7;
    }

    static int c(InputStream inputStream) {
        return (l(inputStream) << 24) | l(inputStream) | (l(inputStream) << 8) | (l(inputStream) << 16);
    }

    static long d(InputStream inputStream) {
        return (l(inputStream) & 255) | ((l(inputStream) & 255) << 8) | ((l(inputStream) & 255) << 16) | ((l(inputStream) & 255) << 24) | ((l(inputStream) & 255) << 32) | ((l(inputStream) & 255) << 40) | ((l(inputStream) & 255) << 48) | ((l(inputStream) & 255) << 56);
    }

    static String f(C3132k7 c3132k7) {
        return new String(k(c3132k7, d(c3132k7)), "UTF-8");
    }

    static void h(OutputStream outputStream, int i8) {
        outputStream.write(i8 & 255);
        outputStream.write((i8 >> 8) & 255);
        outputStream.write((i8 >> 16) & 255);
        outputStream.write((i8 >> 24) & 255);
    }

    static void i(OutputStream outputStream, long j8) {
        outputStream.write((byte) j8);
        outputStream.write((byte) (j8 >>> 8));
        outputStream.write((byte) (j8 >>> 16));
        outputStream.write((byte) (j8 >>> 24));
        outputStream.write((byte) (j8 >>> 32));
        outputStream.write((byte) (j8 >>> 40));
        outputStream.write((byte) (j8 >>> 48));
        outputStream.write((byte) (j8 >>> 56));
    }

    static void j(OutputStream outputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] k(C3132k7 c3132k7, long j8) {
        long d8 = c3132k7.d();
        if (j8 >= 0 && j8 <= d8) {
            int i8 = (int) j8;
            if (i8 == j8) {
                byte[] bArr = new byte[i8];
                new DataInputStream(c3132k7).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j8 + ", maxLength=" + d8);
    }

    private static int l(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void m(String str, C3023j7 c3023j7) {
        if (this.f24460a.containsKey(str)) {
            this.f24461b += c3023j7.f23185a - ((C3023j7) this.f24460a.get(str)).f23185a;
        } else {
            this.f24461b += c3023j7.f23185a;
        }
        this.f24460a.put(str, c3023j7);
    }

    private final void o(String str) {
        C3023j7 c3023j7 = (C3023j7) this.f24460a.remove(str);
        if (c3023j7 != null) {
            this.f24461b -= c3023j7.f23185a;
        }
    }

    private static final String p(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void a(String str, boolean z7) {
        G6 n8 = n(str);
        if (n8 != null) {
            n8.f15272f = 0L;
            n8.f15271e = 0L;
            b(str, n8);
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void b(String str, G6 g62) {
        long j8;
        try {
            long j9 = this.f24461b;
            int length = g62.f15267a.length;
            long j10 = j9 + length;
            int i8 = this.f24463d;
            if (j10 <= i8 || length <= i8 * 0.9f) {
                File e8 = e(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e8));
                    C3023j7 c3023j7 = new C3023j7(str, g62);
                    try {
                        h(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, c3023j7.f23186b);
                        String str2 = c3023j7.f23187c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        i(bufferedOutputStream, c3023j7.f23188d);
                        i(bufferedOutputStream, c3023j7.f23189e);
                        i(bufferedOutputStream, c3023j7.f23190f);
                        i(bufferedOutputStream, c3023j7.f23191g);
                        List<O6> list = c3023j7.f23192h;
                        if (list != null) {
                            h(bufferedOutputStream, list.size());
                            for (O6 o62 : list) {
                                j(bufferedOutputStream, o62.a());
                                j(bufferedOutputStream, o62.b());
                            }
                        } else {
                            h(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(g62.f15267a);
                        bufferedOutputStream.close();
                        c3023j7.f23185a = e8.length();
                        m(str, c3023j7);
                        if (this.f24461b >= this.f24463d) {
                            if (AbstractC2155b7.f20816b) {
                                AbstractC2155b7.d("Pruning old cache entries.", new Object[0]);
                            }
                            long j11 = this.f24461b;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.f24460a.entrySet().iterator();
                            int i9 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j8 = j11;
                                    break;
                                }
                                C3023j7 c3023j72 = (C3023j7) ((Map.Entry) it.next()).getValue();
                                if (e(c3023j72.f23186b).delete()) {
                                    j8 = j11;
                                    this.f24461b -= c3023j72.f23185a;
                                } else {
                                    j8 = j11;
                                    String str3 = c3023j72.f23186b;
                                    AbstractC2155b7.a("Could not delete cache entry for key=%s, filename=%s", str3, p(str3));
                                }
                                it.remove();
                                i9++;
                                if (this.f24461b < this.f24463d * 0.9f) {
                                    break;
                                } else {
                                    j11 = j8;
                                }
                            }
                            if (AbstractC2155b7.f20816b) {
                                AbstractC2155b7.d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i9), Long.valueOf(this.f24461b - j8), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e9) {
                        AbstractC2155b7.a("%s", e9.toString());
                        bufferedOutputStream.close();
                        AbstractC2155b7.a("Failed to write header for %s", e8.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!e8.delete()) {
                        AbstractC2155b7.a("Could not clean up file %s", e8.getAbsolutePath());
                    }
                    if (!this.f24462c.zza().exists()) {
                        AbstractC2155b7.a("Re-initializing cache after external clearing.", new Object[0]);
                        this.f24460a.clear();
                        this.f24461b = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File e(String str) {
        return new File(this.f24462c.zza(), p(str));
    }

    public final synchronized void g(String str) {
        boolean delete = e(str).delete();
        o(str);
        if (delete) {
            return;
        }
        AbstractC2155b7.a("Could not delete cache entry for key=%s, filename=%s", str, p(str));
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized G6 n(String str) {
        C3023j7 c3023j7 = (C3023j7) this.f24460a.get(str);
        if (c3023j7 == null) {
            return null;
        }
        File e8 = e(str);
        try {
            C3132k7 c3132k7 = new C3132k7(new BufferedInputStream(new FileInputStream(e8)), e8.length());
            try {
                C3023j7 a8 = C3023j7.a(c3132k7);
                if (!TextUtils.equals(str, a8.f23186b)) {
                    AbstractC2155b7.a("%s: key=%s, found=%s", e8.getAbsolutePath(), str, a8.f23186b);
                    o(str);
                    return null;
                }
                byte[] k8 = k(c3132k7, c3132k7.d());
                G6 g62 = new G6();
                g62.f15267a = k8;
                g62.f15268b = c3023j7.f23187c;
                g62.f15269c = c3023j7.f23188d;
                g62.f15270d = c3023j7.f23189e;
                g62.f15271e = c3023j7.f23190f;
                g62.f15272f = c3023j7.f23191g;
                List<O6> list = c3023j7.f23192h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (O6 o62 : list) {
                    treeMap.put(o62.a(), o62.b());
                }
                g62.f15273g = treeMap;
                g62.f15274h = DesugarCollections.unmodifiableList(c3023j7.f23192h);
                return g62;
            } finally {
                c3132k7.close();
            }
        } catch (IOException e9) {
            AbstractC2155b7.a("%s: %s", e8.getAbsolutePath(), e9.toString());
            g(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.H6
    public final synchronized void zzb() {
        long length;
        C3132k7 c3132k7;
        synchronized (this) {
            File zza = this.f24462c.zza();
            if (zza.exists()) {
                File[] listFiles = zza.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        try {
                            length = file.length();
                            c3132k7 = new C3132k7(new BufferedInputStream(new FileInputStream(file)), length);
                        } catch (IOException unused) {
                            file.delete();
                        }
                        try {
                            C3023j7 a8 = C3023j7.a(c3132k7);
                            a8.f23185a = length;
                            m(a8.f23186b, a8);
                            c3132k7.close();
                        } catch (Throwable th) {
                            c3132k7.close();
                            throw th;
                        }
                    }
                }
            } else if (!zza.mkdirs()) {
                AbstractC2155b7.b("Unable to create cache dir %s", zza.getAbsolutePath());
            }
        }
    }

    public C3350m7(File file, int i8) {
        this.f24462c = new C2916i7(this, file);
    }
}
