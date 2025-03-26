package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Id0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408Id0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f15972e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f15973f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f15974g;

    /* renamed from: h, reason: collision with root package name */
    private long f15975h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15976i;

    public C1408Id0(Context context) {
        super(false);
        this.f15972e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f15975h;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new zzfp(e8, 2000);
            }
        }
        InputStream inputStream = this.f15974g;
        int i10 = AbstractC2301cW.f21206a;
        int read = inputStream.read(bArr, i8, i9);
        if (read == -1) {
            return -1;
        }
        long j9 = this.f15975h;
        if (j9 != -1) {
            this.f15975h = j9 - read;
        }
        z(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f15973f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f15973f = null;
        try {
            try {
                InputStream inputStream = this.f15974g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f15974g = null;
                if (this.f15976i) {
                    this.f15976i = false;
                    g();
                }
            } catch (IOException e8) {
                throw new zzfp(e8, 2000);
            }
        } catch (Throwable th) {
            this.f15974g = null;
            if (this.f15976i) {
                this.f15976i = false;
                g();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        try {
            Uri uri = c4393vk0.f27331a;
            this.f15973f = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            i(c4393vk0);
            InputStream open = this.f15972e.open(path, 1);
            this.f15974g = open;
            if (open.skip(c4393vk0.f27335e) < c4393vk0.f27335e) {
                throw new zzfp(null, 2008);
            }
            long j8 = c4393vk0.f27336f;
            if (j8 != -1) {
                this.f15975h = j8;
            } else {
                long available = this.f15974g.available();
                this.f15975h = available;
                if (available == 2147483647L) {
                    this.f15975h = -1L;
                }
            }
            this.f15976i = true;
            j(c4393vk0);
            return this.f15975h;
        } catch (zzfp e8) {
            throw e8;
        } catch (IOException e9) {
            throw new zzfp(e9, true != (e9 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
