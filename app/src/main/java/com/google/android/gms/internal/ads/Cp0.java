package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class Cp0 extends AbstractC2314ce0 {

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f14233e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f14234f;

    /* renamed from: g, reason: collision with root package name */
    private long f14235g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14236h;

    public Cp0() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f14235g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14233e;
            int i10 = AbstractC2301cW.f21206a;
            int read = randomAccessFile.read(bArr, i8, (int) Math.min(j8, i9));
            if (read > 0) {
                this.f14235g -= read;
                z(read);
            }
            return read;
        } catch (IOException e8) {
            throw new zzgm(e8, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f14234f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f14234f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f14233e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f14233e = null;
                if (this.f14236h) {
                    this.f14236h = false;
                    g();
                }
            } catch (IOException e8) {
                throw new zzgm(e8, 2000);
            }
        } catch (Throwable th) {
            this.f14233e = null;
            if (this.f14236h) {
                this.f14236h = false;
                g();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        Uri uri = c4393vk0.f27331a;
        this.f14234f = uri;
        i(c4393vk0);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f14233e = randomAccessFile;
            try {
                randomAccessFile.seek(c4393vk0.f27335e);
                long j8 = c4393vk0.f27336f;
                if (j8 == -1) {
                    j8 = this.f14233e.length() - c4393vk0.f27335e;
                }
                this.f14235g = j8;
                if (j8 < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.f14236h = true;
                j(c4393vk0);
                return this.f14235g;
            } catch (IOException e8) {
                throw new zzgm(e8, 2000);
            }
        } catch (FileNotFoundException e9) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(e9, ((e9.getCause() instanceof ErrnoException) && ((ErrnoException) e9.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzgm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e9, 1004);
        } catch (SecurityException e10) {
            throw new zzgm(e10, 2006);
        } catch (RuntimeException e11) {
            throw new zzgm(e11, 2000);
        }
    }
}
