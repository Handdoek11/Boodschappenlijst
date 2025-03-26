package N1;

import H1.b;
import N1.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f4065b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4066c;

    /* renamed from: e, reason: collision with root package name */
    private H1.b f4068e;

    /* renamed from: d, reason: collision with root package name */
    private final c f4067d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f4064a = new j();

    protected e(File file, long j8) {
        this.f4065b = file;
        this.f4066c = j8;
    }

    public static a c(File file, long j8) {
        return new e(file, j8);
    }

    private synchronized H1.b d() {
        try {
            if (this.f4068e == null) {
                this.f4068e = H1.b.K(this.f4065b, 1, 1, this.f4066c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4068e;
    }

    @Override // N1.a
    public File a(J1.e eVar) {
        String b8 = this.f4064a.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b8 + " for for Key: " + eVar);
        }
        try {
            b.e G7 = d().G(b8);
            if (G7 != null) {
                return G7.a(0);
            }
            return null;
        } catch (IOException e8) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e8);
            return null;
        }
    }

    @Override // N1.a
    public void b(J1.e eVar, a.b bVar) {
        H1.b d8;
        String b8 = this.f4064a.b(eVar);
        this.f4067d.a(b8);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b8 + " for for Key: " + eVar);
            }
            try {
                d8 = d();
            } catch (IOException e8) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e8);
                }
            }
            if (d8.G(b8) != null) {
                return;
            }
            b.c B7 = d8.B(b8);
            if (B7 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + b8);
            }
            try {
                if (bVar.a(B7.f(0))) {
                    B7.e();
                }
                B7.b();
            } catch (Throwable th) {
                B7.b();
                throw th;
            }
        } finally {
            this.f4067d.b(b8);
        }
    }
}
