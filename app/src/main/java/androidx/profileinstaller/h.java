package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d f10737a = androidx.concurrent.futures.d.z();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f10738b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f10739c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f10740a;

        /* renamed from: b, reason: collision with root package name */
        final int f10741b;

        /* renamed from: c, reason: collision with root package name */
        final long f10742c;

        /* renamed from: d, reason: collision with root package name */
        final long f10743d;

        b(int i8, int i9, long j8, long j9) {
            this.f10740a = i8;
            this.f10741b = i9;
            this.f10742c = j8;
            this.f10743d = j9;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f10740a);
                dataOutputStream.writeInt(this.f10741b);
                dataOutputStream.writeLong(this.f10742c);
                dataOutputStream.writeLong(this.f10743d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10741b == bVar.f10741b && this.f10742c == bVar.f10742c && this.f10740a == bVar.f10740a && this.f10743d == bVar.f10743d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f10741b), Long.valueOf(this.f10742c), Integer.valueOf(this.f10740a), Long.valueOf(this.f10743d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f10744a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10745b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f10746c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10747d;

        c(int i8, boolean z7, boolean z8, boolean z9) {
            this.f10744a = i8;
            this.f10746c = z8;
            this.f10745b = z7;
            this.f10747d = z9;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i8, boolean z7, boolean z8, boolean z9) {
        c cVar = new c(i8, z7, z8, z9);
        f10739c = cVar;
        f10737a.v(cVar);
        return f10739c;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
