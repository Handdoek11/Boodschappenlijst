package H1;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: B, reason: collision with root package name */
    private int f2875B;

    /* renamed from: o, reason: collision with root package name */
    private final File f2879o;

    /* renamed from: s, reason: collision with root package name */
    private final File f2880s;

    /* renamed from: t, reason: collision with root package name */
    private final File f2881t;

    /* renamed from: u, reason: collision with root package name */
    private final File f2882u;

    /* renamed from: v, reason: collision with root package name */
    private final int f2883v;

    /* renamed from: w, reason: collision with root package name */
    private long f2884w;

    /* renamed from: x, reason: collision with root package name */
    private final int f2885x;

    /* renamed from: z, reason: collision with root package name */
    private Writer f2887z;

    /* renamed from: y, reason: collision with root package name */
    private long f2886y = 0;

    /* renamed from: A, reason: collision with root package name */
    private final LinkedHashMap f2874A = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: C, reason: collision with root package name */
    private long f2876C = 0;

    /* renamed from: D, reason: collision with root package name */
    final ThreadPoolExecutor f2877D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0047b(null));

    /* renamed from: E, reason: collision with root package name */
    private final Callable f2878E = new a();

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (b.this) {
                try {
                    if (b.this.f2887z == null) {
                        return null;
                    }
                    b.this.e0();
                    if (b.this.I()) {
                        b.this.X();
                        b.this.f2875B = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: H1.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0047b implements ThreadFactory {
        private ThreadFactoryC0047b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ ThreadFactoryC0047b(a aVar) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f2889a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f2890b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2891c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.u(this, false);
        }

        public void b() {
            if (this.f2891c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            b.this.u(this, true);
            this.f2891c = true;
        }

        public File f(int i8) {
            File k8;
            synchronized (b.this) {
                try {
                    if (this.f2889a.f2898f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f2889a.f2897e) {
                        this.f2890b[i8] = true;
                    }
                    k8 = this.f2889a.k(i8);
                    b.this.f2879o.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k8;
        }

        private c(d dVar) {
            this.f2889a = dVar;
            this.f2890b = dVar.f2897e ? null : new boolean[b.this.f2885x];
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f2893a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f2894b;

        /* renamed from: c, reason: collision with root package name */
        File[] f2895c;

        /* renamed from: d, reason: collision with root package name */
        File[] f2896d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2897e;

        /* renamed from: f, reason: collision with root package name */
        private c f2898f;

        /* renamed from: g, reason: collision with root package name */
        private long f2899g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length != b.this.f2885x) {
                throw m(strArr);
            }
            for (int i8 = 0; i8 < strArr.length; i8++) {
                try {
                    this.f2894b[i8] = Long.parseLong(strArr[i8]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i8) {
            return this.f2895c[i8];
        }

        public File k(int i8) {
            return this.f2896d[i8];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j8 : this.f2894b) {
                sb.append(' ');
                sb.append(j8);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f2893a = str;
            this.f2894b = new long[b.this.f2885x];
            this.f2895c = new File[b.this.f2885x];
            this.f2896d = new File[b.this.f2885x];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i8 = 0; i8 < b.this.f2885x; i8++) {
                sb.append(i8);
                this.f2895c[i8] = new File(b.this.f2879o, sb.toString());
                sb.append(".tmp");
                this.f2896d[i8] = new File(b.this.f2879o, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f2901a;

        /* renamed from: b, reason: collision with root package name */
        private final long f2902b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f2903c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f2904d;

        /* synthetic */ e(b bVar, String str, long j8, File[] fileArr, long[] jArr, a aVar) {
            this(str, j8, fileArr, jArr);
        }

        public File a(int i8) {
            return this.f2904d[i8];
        }

        private e(String str, long j8, File[] fileArr, long[] jArr) {
            this.f2901a = str;
            this.f2902b = j8;
            this.f2904d = fileArr;
            this.f2903c = jArr;
        }
    }

    private b(File file, int i8, int i9, long j8) {
        this.f2879o = file;
        this.f2883v = i8;
        this.f2880s = new File(file, "journal");
        this.f2881t = new File(file, "journal.tmp");
        this.f2882u = new File(file, "journal.bkp");
        this.f2885x = i9;
        this.f2884w = j8;
    }

    private static void A(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c D(String str, long j8) {
        l();
        d dVar = (d) this.f2874A.get(str);
        a aVar = null;
        if (j8 != -1 && (dVar == null || dVar.f2899g != j8)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f2874A.put(str, dVar);
        } else if (dVar.f2898f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f2898f = cVar;
        this.f2887z.append((CharSequence) "DIRTY");
        this.f2887z.append(' ');
        this.f2887z.append((CharSequence) str);
        this.f2887z.append('\n');
        E(this.f2887z);
        return cVar;
    }

    private static void E(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean I() {
        int i8 = this.f2875B;
        return i8 >= 2000 && i8 >= this.f2874A.size();
    }

    public static b K(File file, int i8, int i9, long j8) {
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i9 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                c0(file2, file3, false);
            }
        }
        b bVar = new b(file, i8, i9, j8);
        if (bVar.f2880s.exists()) {
            try {
                bVar.N();
                bVar.M();
                return bVar;
            } catch (IOException e8) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e8.getMessage() + ", removing");
                bVar.z();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i8, i9, j8);
        bVar2.X();
        return bVar2;
    }

    private void M() {
        A(this.f2881t);
        Iterator it = this.f2874A.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i8 = 0;
            if (dVar.f2898f == null) {
                while (i8 < this.f2885x) {
                    this.f2886y += dVar.f2894b[i8];
                    i8++;
                }
            } else {
                dVar.f2898f = null;
                while (i8 < this.f2885x) {
                    A(dVar.j(i8));
                    A(dVar.k(i8));
                    i8++;
                }
                it.remove();
            }
        }
    }

    private void N() {
        H1.c cVar = new H1.c(new FileInputStream(this.f2880s), H1.d.f2912a);
        try {
            String g8 = cVar.g();
            String g9 = cVar.g();
            String g10 = cVar.g();
            String g11 = cVar.g();
            String g12 = cVar.g();
            if (!"libcore.io.DiskLruCache".equals(g8) || !"1".equals(g9) || !Integer.toString(this.f2883v).equals(g10) || !Integer.toString(this.f2885x).equals(g11) || !"".equals(g12)) {
                throw new IOException("unexpected journal header: [" + g8 + ", " + g9 + ", " + g11 + ", " + g12 + "]");
            }
            int i8 = 0;
            while (true) {
                try {
                    T(cVar.g());
                    i8++;
                } catch (EOFException unused) {
                    this.f2875B = i8 - this.f2874A.size();
                    if (cVar.f()) {
                        X();
                    } else {
                        this.f2887z = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2880s, true), H1.d.f2912a));
                    }
                    H1.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            H1.d.a(cVar);
            throw th;
        }
    }

    private void T(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i8 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i8);
        if (indexOf2 == -1) {
            substring = str.substring(i8);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f2874A.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i8, indexOf2);
        }
        d dVar = (d) this.f2874A.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f2874A.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f2897e = true;
            dVar.f2898f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f2898f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void X() {
        try {
            Writer writer = this.f2887z;
            if (writer != null) {
                m(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2881t), H1.d.f2912a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f2883v));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f2885x));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f2874A.values()) {
                    if (dVar.f2898f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f2893a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f2893a + dVar.l() + '\n');
                    }
                }
                m(bufferedWriter);
                if (this.f2880s.exists()) {
                    c0(this.f2880s, this.f2882u, true);
                }
                c0(this.f2881t, this.f2880s, false);
                this.f2882u.delete();
                this.f2887z = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2880s, true), H1.d.f2912a));
            } catch (Throwable th) {
                m(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void c0(File file, File file2, boolean z7) {
        if (z7) {
            A(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        while (this.f2886y > this.f2884w) {
            b0((String) ((Map.Entry) this.f2874A.entrySet().iterator().next()).getKey());
        }
    }

    private void l() {
        if (this.f2887z == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void m(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u(c cVar, boolean z7) {
        d dVar = cVar.f2889a;
        if (dVar.f2898f != cVar) {
            throw new IllegalStateException();
        }
        if (z7 && !dVar.f2897e) {
            for (int i8 = 0; i8 < this.f2885x; i8++) {
                if (!cVar.f2890b[i8]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i8);
                }
                if (!dVar.k(i8).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i9 = 0; i9 < this.f2885x; i9++) {
            File k8 = dVar.k(i9);
            if (!z7) {
                A(k8);
            } else if (k8.exists()) {
                File j8 = dVar.j(i9);
                k8.renameTo(j8);
                long j9 = dVar.f2894b[i9];
                long length = j8.length();
                dVar.f2894b[i9] = length;
                this.f2886y = (this.f2886y - j9) + length;
            }
        }
        this.f2875B++;
        dVar.f2898f = null;
        if (dVar.f2897e || z7) {
            dVar.f2897e = true;
            this.f2887z.append((CharSequence) "CLEAN");
            this.f2887z.append(' ');
            this.f2887z.append((CharSequence) dVar.f2893a);
            this.f2887z.append((CharSequence) dVar.l());
            this.f2887z.append('\n');
            if (z7) {
                long j10 = this.f2876C;
                this.f2876C = 1 + j10;
                dVar.f2899g = j10;
            }
        } else {
            this.f2874A.remove(dVar.f2893a);
            this.f2887z.append((CharSequence) "REMOVE");
            this.f2887z.append(' ');
            this.f2887z.append((CharSequence) dVar.f2893a);
            this.f2887z.append('\n');
        }
        E(this.f2887z);
        if (this.f2886y > this.f2884w || I()) {
            this.f2877D.submit(this.f2878E);
        }
    }

    public c B(String str) {
        return D(str, -1L);
    }

    public synchronized e G(String str) {
        l();
        d dVar = (d) this.f2874A.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f2897e) {
            return null;
        }
        for (File file : dVar.f2895c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f2875B++;
        this.f2887z.append((CharSequence) "READ");
        this.f2887z.append(' ');
        this.f2887z.append((CharSequence) str);
        this.f2887z.append('\n');
        if (I()) {
            this.f2877D.submit(this.f2878E);
        }
        return new e(this, str, dVar.f2899g, dVar.f2895c, dVar.f2894b, null);
    }

    public synchronized boolean b0(String str) {
        try {
            l();
            d dVar = (d) this.f2874A.get(str);
            if (dVar != null && dVar.f2898f == null) {
                for (int i8 = 0; i8 < this.f2885x; i8++) {
                    File j8 = dVar.j(i8);
                    if (j8.exists() && !j8.delete()) {
                        throw new IOException("failed to delete " + j8);
                    }
                    this.f2886y -= dVar.f2894b[i8];
                    dVar.f2894b[i8] = 0;
                }
                this.f2875B++;
                this.f2887z.append((CharSequence) "REMOVE");
                this.f2887z.append(' ');
                this.f2887z.append((CharSequence) str);
                this.f2887z.append('\n');
                this.f2874A.remove(str);
                if (I()) {
                    this.f2877D.submit(this.f2878E);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f2887z == null) {
                return;
            }
            Iterator it = new ArrayList(this.f2874A.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f2898f != null) {
                    dVar.f2898f.a();
                }
            }
            e0();
            m(this.f2887z);
            this.f2887z = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void z() {
        close();
        H1.d.b(this.f2879o);
    }
}
