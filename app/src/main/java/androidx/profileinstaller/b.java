package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f10706a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f10707b;

    /* renamed from: c, reason: collision with root package name */
    private final f.c f10708c;

    /* renamed from: e, reason: collision with root package name */
    private final File f10710e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10711f;

    /* renamed from: g, reason: collision with root package name */
    private final String f10712g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10713h;

    /* renamed from: j, reason: collision with root package name */
    private c[] f10715j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f10716k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10714i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10709d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f10706a = assetManager;
        this.f10707b = executor;
        this.f10708c = cVar;
        this.f10711f = str;
        this.f10712g = str2;
        this.f10713h = str3;
        this.f10710e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream h8;
        try {
            h8 = h(this.f10706a, this.f10713h);
        } catch (FileNotFoundException e8) {
            this.f10708c.b(9, e8);
        } catch (IOException e9) {
            this.f10708c.b(7, e9);
        } catch (IllegalStateException e10) {
            this.f10715j = null;
            this.f10708c.b(8, e10);
        }
        if (h8 == null) {
            if (h8 != null) {
                h8.close();
            }
            return null;
        }
        try {
            this.f10715j = g.r(h8, g.p(h8, g.f10736b), bArr, cVarArr);
            h8.close();
            return this;
        } catch (Throwable th) {
            try {
                h8.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void c() {
        if (!this.f10714i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 24) {
            return null;
        }
        if (i8 >= 31) {
            return i.f10748a;
        }
        switch (i8) {
            case 24:
            case 25:
                return i.f10752e;
            case 26:
                return i.f10751d;
            case 27:
                return i.f10750c;
            case 28:
            case 29:
            case 30:
                return i.f10749b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f10712g);
        } catch (FileNotFoundException e8) {
            this.f10708c.b(6, e8);
            return null;
        } catch (IOException e9) {
            this.f10708c.b(7, e9);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i8, Object obj) {
        this.f10708c.b(i8, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f10708c.a(5, null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        c[] x7 = g.x(inputStream, g.p(inputStream, g.f10735a), this.f10711f);
                        try {
                            inputStream.close();
                            return x7;
                        } catch (IOException e8) {
                            this.f10708c.b(7, e8);
                            return x7;
                        }
                    } catch (IOException e9) {
                        this.f10708c.b(7, e9);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e10) {
                    this.f10708c.b(8, e10);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e11) {
                this.f10708c.b(7, e11);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e12) {
                this.f10708c.b(7, e12);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 24) {
            return false;
        }
        return i8 >= 31 || i8 == 24 || i8 == 25;
    }

    private void l(final int i8, final Object obj) {
        this.f10707b.execute(new Runnable() { // from class: a1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f6513o.g(i8, obj);
            }
        });
    }

    public boolean e() {
        if (this.f10709d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f10710e.exists()) {
            try {
                if (!this.f10710e.createNewFile()) {
                    l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f10710e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f10714i = true;
        return true;
    }

    public b i() {
        b b8;
        c();
        if (this.f10709d == null) {
            return this;
        }
        InputStream f8 = f(this.f10706a);
        if (f8 != null) {
            this.f10715j = j(f8);
        }
        c[] cVarArr = this.f10715j;
        return (cVarArr == null || !k() || (b8 = b(cVarArr, this.f10709d)) == null) ? this : b8;
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f10715j;
        byte[] bArr = this.f10709d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e8) {
                this.f10708c.b(7, e8);
            } catch (IllegalStateException e9) {
                this.f10708c.b(8, e9);
            }
            try {
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f10708c.b(5, null);
                    this.f10715j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f10716k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f10715j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f10716k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f10710e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock tryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, tryLock);
                                l(1, null);
                                if (tryLock != null) {
                                    tryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e8) {
                l(6, e8);
                return false;
            } catch (IOException e9) {
                l(7, e9);
                return false;
            }
        } finally {
            this.f10716k = null;
            this.f10715j = null;
        }
    }
}
